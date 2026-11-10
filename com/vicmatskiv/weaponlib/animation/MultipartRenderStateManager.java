/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager$TransitionedPositioning.PartData
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 */
package com.vicmatskiv.weaponlib.animation;

import com.vicmatskiv.weaponlib.animation.MatrixHelper;
import com.vicmatskiv.weaponlib.animation.MultipartPositioning;
import com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager;
import com.vicmatskiv.weaponlib.animation.MultipartTransition;
import com.vicmatskiv.weaponlib.animation.MultipartTransitionProvider;
import com.vicmatskiv.weaponlib.animation.PartPositionProvider;
import com.vicmatskiv.weaponlib.animation.Randomizer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

public class MultipartRenderStateManager<State, Part, Context extends PartPositionProvider> {
    private static final Logger logger = LogManager.getLogger(MultipartRenderStateManager.class);
    private Randomizer randomizer;
    private Supplier<Long> currentTimeProvider;
    private WeakHashMap<Part, Matrix4f> lastApplied = new WeakHashMap();
    private StateContainer<State> currentStateContainer;
    private MultipartTransitionProvider<State, Part, Context> transitionProvider;
    private Deque<MultipartPositioning<Part, Context>> positioningQueue;

    public MultipartRenderStateManager(State initialState, MultipartTransitionProvider<State, Part, Context> transitionProvider) {
        this(initialState, transitionProvider, System::currentTimeMillis);
    }

    public MultipartRenderStateManager(State initialState, MultipartTransitionProvider<State, Part, Context> transitionProvider, Supplier<Long> currentTimeProvider) {
        this.transitionProvider = transitionProvider;
        this.positioningQueue = new LinkedList<MultipartPositioning<Part, Context>>();
        this.randomizer = new Randomizer();
        this.currentTimeProvider = currentTimeProvider;
        this.setState(initialState, false, true);
    }

    public void setCycleState(State cycleState, boolean immediate) {
        if (cycleState == null) {
            throw new IllegalArgumentException("State cannot be null");
        }
        if (immediate) {
            this.positioningQueue.clear();
        }
        if (this.positioningQueue.size() <= 1) {
            StateContainer<State> addedState;
            if (cycleState.equals(this.currentStateContainer.state) && !this.currentStateContainer.isEndOfLoop) {
                addedState = new StateContainer<State>(cycleState, true);
            } else {
                addedState = new StateContainer<State>(cycleState, false);
                this.positioningQueue.add(new TransitionedPositioning(this.currentStateContainer.state, addedState.state, false));
                this.positioningQueue.add(new StaticPositioning(addedState.state));
            }
            this.currentStateContainer = addedState;
        }
    }

    public void setState(State newState, boolean animated, boolean immediate) {
        this.setState(newState, animated, immediate, false);
    }

    public void setState(State newState, boolean animated, boolean immediate, boolean fromAnchored) {
        if (newState == null) {
            throw new IllegalArgumentException("State cannot be null");
        }
        if (this.currentStateContainer != null && newState.equals(this.currentStateContainer.state)) {
            return;
        }
        if (immediate) {
            this.positioningQueue.clear();
        }
        if (animated) {
            this.positioningQueue.add(new TransitionedPositioning(this.currentStateContainer != null ? (Object)this.currentStateContainer.state : null, newState, fromAnchored));
        }
        this.positioningQueue.add(new StaticPositioning(newState));
        this.currentStateContainer = new StateContainer<State>(newState);
    }

    public State getLastState() {
        return this.currentStateContainer != null ? (State)this.currentStateContainer.state : null;
    }

    public MultipartPositioning<Part, Context> nextPositioning() {
        MultipartPositioning<Part, Context> result = null;
        while (!this.positioningQueue.isEmpty()) {
            MultipartPositioning<Part, Context> p = this.positioningQueue.poll();
            if (p.isExpired(this.positioningQueue)) continue;
            this.positioningQueue.addFirst(p);
            result = p;
            break;
        }
        if (result == null) {
            throw new IllegalStateException("Position cannot be null");
        }
        return result;
    }

    private static class StateContainer<State> {
        State state;
        boolean isEndOfLoop;

        StateContainer(State state, boolean isEndOfLoop) {
            this.state = state;
            this.isEndOfLoop = isEndOfLoop;
        }

        StateContainer(State state) {
            this(state, false);
        }
    }

    private class TransitionedPositioning
    implements MultipartPositioning<Part, Context> {
        private Map<Part, com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager$TransitionedPositioning.PartData> partDataMap = new HashMap();
        private Long startTime;
        private long totalDuration;
        private int currentIndex;
        private long currentStartTime;
        private boolean expired;
        private int segmentCount;
        private List<MultipartTransition<Part, Context>> fromPositioning;
        private List<MultipartTransition<Part, Context>> toPositioning;
        private State fromState;
        private State toState;
        private boolean fromAnchored;

        TransitionedPositioning(State fromState, State toState, boolean fromAnchored) {
            this.fromState = fromState;
            this.toState = toState;
            this.fromAnchored = fromAnchored;
            this.fromPositioning = MultipartRenderStateManager.this.transitionProvider.getTransitions(fromState);
            this.toPositioning = MultipartRenderStateManager.this.transitionProvider.getTransitions(toState);
            this.segmentCount = this.toPositioning.size();
            for (MultipartTransition t : this.toPositioning) {
                this.totalDuration += t.getDuration() + t.getPause();
            }
        }

        @Override
        public float getProgress() {
            return this.startTime != null ? (float)((Long)MultipartRenderStateManager.this.currentTimeProvider.get() - this.startTime) / (float)this.totalDuration : 0.0f;
        }

        @Override
        public boolean isExpired(Queue<MultipartPositioning<Part, Context>> positioningQueue) {
            return this.expired;
        }

        @Override
        public <T> T getFromState(Class<T> stateClass) {
            return stateClass.cast(this.fromState);
        }

        @Override
        public <T> T getToState(Class<T> stateClass) {
            return stateClass.cast(this.toState);
        }

        private Matrix4f adjustToAttached(Matrix4f matrix, Part fromAttached, Part toAttached, Context context) {
            if (fromAttached == toAttached) {
                return matrix;
            }
            Matrix4f fromMatrix = context.getPartPosition(fromAttached);
            if (fromMatrix == null) {
                return matrix;
            }
            Matrix4f toMatrix = context.getPartPosition(toAttached);
            if (toMatrix == null) {
                return matrix;
            }
            Matrix4f invertedToMatrix = Matrix4f.invert((Matrix4f)toMatrix, null);
            if (invertedToMatrix == null) {
                return matrix;
            }
            Matrix4f correctionMatrix = Matrix4f.mul((Matrix4f)invertedToMatrix, (Matrix4f)fromMatrix, null);
            return Matrix4f.mul((Matrix4f)correctionMatrix, (Matrix4f)matrix, null);
        }

        private com.vicmatskiv.weaponlib.animation.MultipartRenderStateManager$TransitionedPositioning.PartData getPartData(Part part, Context context) {
            try {
                return this.partDataMap.computeIfAbsent(part, p -> {
                    PartData pd = new PartData();
                    Matrix4f fromMatrix = null;
                    if (this.fromAnchored) {
                        fromMatrix = (Matrix4f)MultipartRenderStateManager.this.lastApplied.get(p);
                    }
                    if (fromMatrix == null && this.fromPositioning != null) {
                        MultipartTransition fromMultipart = this.fromPositioning.get(this.fromPositioning.size() - 1);
                        if (fromMultipart.getPositioning(part) == MultipartTransition.anchoredPosition()) {
                            fromMatrix = (Matrix4f)MultipartRenderStateManager.this.lastApplied.get(p);
                            if (fromMatrix == null) {
                                fromMatrix = new Matrix4f();
                                fromMatrix.setIdentity();
                            }
                        } else {
                            logger.trace("Getting part data for {}", part);
                            fromMatrix = this.getMatrixForPositioning(fromMultipart, p, context);
                        }
                        fromMatrix = this.adjustToAttached(fromMatrix, fromMultipart.getAttachedTo(p), this.toPositioning.get(0).getAttachedTo(p), context);
                    }
                    if (fromMatrix == null) {
                        fromMatrix = new Matrix4f();
                        fromMatrix.setIdentity();
                    }
                    pd.matrices.add(fromMatrix);
                    pd.attachedTo = this.toPositioning.get(0).getAttachedTo(p);
                    Matrix4f previous = fromMatrix;
                    for (MultipartTransition multipartTransition : this.toPositioning) {
                        Matrix4f current = multipartTransition.getPositioning(part) == MultipartTransition.anchoredPosition() ? previous : this.getMatrixForPositioning(multipartTransition, p, context);
                        pd.matrices.add(current);
                        previous = current;
                    }
                    return pd;
                });
            }
            catch (Exception e) {
                System.err.println("Failed to get data for part " + part + " for transition from [" + this.fromState + "] to [" + this.toState + "]");
                throw e;
            }
        }

        @Override
        public MultipartPositioning.Positioner<Part, Context> getPositioner() {
            long currentTime = (Long)MultipartRenderStateManager.this.currentTimeProvider.get();
            MultipartTransition targetState = this.toPositioning.get(this.currentIndex);
            long currentDuration = targetState.getDuration();
            long currentPause = targetState.getPause();
            if (this.currentIndex == 0 && this.startTime == null) {
                logger.debug("Starting transition {}, duration {}ms, pause {}ms", (Object)this.currentIndex, (Object)currentDuration, (Object)currentPause);
                this.startTime = currentTime;
            }
            if (this.currentStartTime == 0L) {
                this.currentStartTime = currentTime;
            } else if (currentTime > this.currentStartTime + currentDuration + currentPause) {
                logger.debug("Completed transition {}, duration {}ms, pause {}ms", (Object)this.currentIndex, (Object)currentDuration, (Object)currentPause);
                ++this.currentIndex;
                if (logger.isDebugEnabled() && this.currentIndex < this.toPositioning.size()) {
                    MultipartTransition multipartTransition = this.toPositioning.get(this.currentIndex);
                    logger.debug("Starting transition {}, duration {}ms, pause {}ms", (Object)this.currentIndex, (Object)multipartTransition.getDuration(), (Object)multipartTransition.getPause());
                }
                this.currentStartTime = currentTime;
            }
            long currentOffset = currentTime - this.currentStartTime;
            float currentProgress = (float)currentOffset / (float)currentDuration;
            if (currentProgress > 1.0f) {
                currentProgress = 1.0f;
            }
            final float finalCurrentProgress = currentProgress;
            if (this.currentIndex >= this.segmentCount) {
                this.expired = true;
                return new MultipartPositioning.Positioner<Part, Context>(){

                    @Override
                    public void position(Part part, Context context) {
                        PartData partData = TransitionedPositioning.this.getPartData(part, context);
                        TransitionedPositioning.this.applyOnce(part, context, partData.matrices.get(TransitionedPositioning.this.currentIndex - 1), partData.matrices.get(TransitionedPositioning.this.currentIndex), partData.attachedTo, 1.0f);
                    }

                    @Override
                    public void randomize(float rate, float amplitude) {
                        MultipartRenderStateManager.this.randomizer.update(0.0f, 0.0f);
                    }
                };
            }
            return new MultipartPositioning.Positioner<Part, Context>(){

                @Override
                public void position(Part part, Context context) {
                    PartData partData = TransitionedPositioning.this.getPartData(part, context);
                    TransitionedPositioning.this.applyOnce(part, context, partData.matrices.get(TransitionedPositioning.this.currentIndex), partData.matrices.get(TransitionedPositioning.this.currentIndex + 1), partData.attachedTo, finalCurrentProgress);
                }

                @Override
                public void randomize(float rate, float amplitude) {
                    MultipartRenderStateManager.this.randomizer.update(0.0f, 0.0f);
                }
            };
        }

        private void applyOnce(Part part, Context context, Matrix4f beforeMatrix, Matrix4f afterMatrix, Part attachedTo, float progress) {
            logger.trace("Applying position for part {}", part);
            Matrix4f currentMatrix = null;
            if (attachedTo != null) {
                currentMatrix = context.getPartPosition(attachedTo);
            }
            if (currentMatrix == null) {
                currentMatrix = MatrixHelper.captureMatrix();
            }
            Matrix4f m1 = MatrixHelper.interpolateMatrix(beforeMatrix, 1.0f - progress);
            Matrix4f m2 = MatrixHelper.interpolateMatrix(afterMatrix, progress);
            Matrix4f deltaMatrix = Matrix4f.add((Matrix4f)m1, (Matrix4f)m2, null);
            MultipartRenderStateManager.this.lastApplied.put(part, deltaMatrix);
            Matrix4f composite = Matrix4f.mul((Matrix4f)currentMatrix, (Matrix4f)deltaMatrix, null);
            MatrixHelper.loadMatrix(composite);
        }

        private Matrix4f getMatrixForPositioning(MultipartTransition<Part, Context> transition, Part part, Context context) {
            GL11.glPushMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glLoadIdentity();
            FloatBuffer buf = BufferUtils.createFloatBuffer((int)16);
            transition.position(part, context);
            GL11.glGetFloat((int)2982, (FloatBuffer)buf);
            buf.rewind();
            Matrix4f matrix = new Matrix4f();
            matrix.load(buf);
            GL11.glPopMatrix();
            return matrix;
        }

        private class PartData {
            List<Matrix4f> matrices = new ArrayList<Matrix4f>();
            Part attachedTo;

            private PartData() {
            }
        }
    }

    private class StaticPositioning
    implements MultipartPositioning<Part, Context> {
        private State state;

        public StaticPositioning(State state) {
            this.state = state;
        }

        @Override
        public float getProgress() {
            return 1.0f;
        }

        @Override
        public boolean isExpired(Queue<MultipartPositioning<Part, Context>> positioningQueue) {
            return !positioningQueue.isEmpty();
        }

        @Override
        public MultipartPositioning.Positioner<Part, Context> getPositioner() {
            final List transitions = MultipartRenderStateManager.this.transitionProvider.getTransitions(this.state);
            return new MultipartPositioning.Positioner<Part, Context>(){

                @Override
                public void position(Part part, Context context) {
                    try {
                        MultipartTransition multipartTransition = (MultipartTransition)transitions.get(transitions.size() - 1);
                        Object attachedTo = multipartTransition.getAttachedTo(part);
                        if (attachedTo != null) {
                            MatrixHelper.loadMatrix(context.getPartPosition(attachedTo));
                        }
                        if (multipartTransition.getPositioning(part) == MultipartTransition.anchoredPosition()) {
                            Matrix4f m = (Matrix4f)MultipartRenderStateManager.this.lastApplied.get(part);
                            MatrixHelper.applyMatrix(m);
                        } else {
                            multipartTransition.position(part, context);
                        }
                    }
                    catch (Exception e) {
                        System.err.println("Failed to find static position for " + part + " in " + StaticPositioning.this.state);
                        throw e;
                    }
                }

                @Override
                public void randomize(float rate, float amplitude) {
                    MultipartRenderStateManager.this.randomizer.update(rate, amplitude);
                }
            };
        }

        @Override
        public <T> T getFromState(Class<T> stateClass) {
            return stateClass.cast(this.state);
        }

        @Override
        public <T> T getToState(Class<T> stateClass) {
            return stateClass.cast(this.state);
        }
    }
}

