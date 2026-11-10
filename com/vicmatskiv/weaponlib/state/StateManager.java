/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.vicmatskiv.weaponlib.state;

import com.vicmatskiv.weaponlib.state.Aspect;
import com.vicmatskiv.weaponlib.state.ExtendedState;
import com.vicmatskiv.weaponlib.state.ManagedState;
import com.vicmatskiv.weaponlib.state.Permit;
import com.vicmatskiv.weaponlib.state.PermitManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StateManager<S extends ManagedState<S>, E extends ExtendedState<S>> {
    private static final Logger logger = LogManager.getLogger(StateManager.class);
    private StateComparator<S> stateComparator;
    private Map<Aspect<S, ? extends E>, LinkedHashSet<TransitionRule<S, E>>> contextRules = new HashMap<Aspect<S, ? extends E>, LinkedHashSet<TransitionRule<S, E>>>();

    private static <T, U> T safeCast(U u) {
        return (T)u;
    }

    public StateManager(StateComparator<S> stateComparator) {
        this.stateComparator = stateComparator;
    }

    public <EE extends E> RuleBuilder<EE> in(Aspect<S, EE> aspect) {
        return new RuleBuilder<EE>(aspect);
    }

    public Result changeState(Aspect<S, ? extends E> aspect, E extendedState, S ... targetStates) {
        return this.changeState(aspect, (ExtendedState)extendedState, null, (ManagedState[])targetStates);
    }

    public Result changeState(Aspect<S, ? extends E> aspect, E extendedState, Permit<S> permit, S ... targetStates) {
        Object currentState = extendedState.getState();
        return this.changeStateFromTo(aspect, (ExtendedState)extendedState, permit, (ManagedState)currentState, (ManagedState[])targetStates);
    }

    public Result changeStateFromAnyOf(Aspect<S, ? extends E> aspect, E extendedState, Collection<S> fromStates, S ... targetStates) {
        Object currentState = extendedState.getState();
        if (!fromStates.contains(currentState)) {
            return new Result(this, false, (ManagedState)currentState);
        }
        return this.changeStateFromTo(aspect, (ExtendedState)extendedState, (ManagedState)currentState, (ManagedState[])targetStates);
    }

    protected Result changeStateFromTo(Aspect<S, ? extends E> aspect, E extendedState, S currentState, S ... targetStates) {
        return this.changeStateFromTo(aspect, (ExtendedState)extendedState, null, (ManagedState)currentState, (ManagedState[])targetStates);
    }

    protected Result changeStateFromTo(Aspect<S, ? extends E> aspect, E extendedState, Permit<S> permit, S currentState, S ... targetStates) {
        TransitionRule newStateRule;
        if (extendedState == null) {
            return null;
        }
        if (targetStates.length == 1 && Arrays.stream(targetStates).anyMatch(target -> this.stateComparator.compare((ManagedState)currentState, (ManagedState)target))) {
            return new Result(this, false, (ManagedState)currentState);
        }
        Result result = null;
        S s = currentState;
        Object[] ts = targetStates;
        while ((newStateRule = this.findNextStateRule(aspect, (ExtendedState)extendedState, (ManagedState)s, (ManagedState[])ts)) != null) {
            extendedState.setState(newStateRule.toState);
            logger.debug("Changed state of {} to {}", extendedState, newStateRule.toState);
            result = new Result(this, true, (ManagedState)newStateRule.toState);
            if (newStateRule.action != null) {
                result.actionResult = newStateRule.action.execute(extendedState, s, newStateRule.toState, permit);
            }
            s = newStateRule.toState;
            ts = (ManagedState[])StateManager.safeCast(new ManagedState[0]);
        }
        if (result == null) {
            result = new Result(this, false, (ManagedState)s);
        }
        return result;
    }

    private TransitionRule<S, E> findNextStateRule(Aspect<S, ? extends E> aspect, E extendedState, S currentState, S ... targetStates) {
        return this.contextRules.entrySet().stream().filter(e -> e.getKey() == aspect).map(e -> (LinkedHashSet)e.getValue()).flatMap(Collection::stream).filter(rule -> rule.matches(this.stateComparator, extendedState, currentState, targetStates)).findFirst().orElse(null);
    }

    private static class TransitionRule<S extends ManagedState<S>, E extends ExtendedState<S>> {
        S fromState;
        S toState;
        BiPredicate<S, E> predicate;
        PostAction<S, E> action;
        boolean auto;

        TransitionRule(S fromState, S toState, BiPredicate<S, E> predicate, PostAction<S, E> action, boolean auto) {
            if (fromState == null) {
                throw new IllegalArgumentException("From-state cannot be null");
            }
            if (toState == null) {
                throw new IllegalArgumentException("To-state cannot be null");
            }
            this.fromState = fromState;
            this.toState = toState;
            this.predicate = predicate;
            this.action = action;
            this.auto = auto;
        }

        boolean matches(StateComparator<S> stateComparator, E context, S fromState, S ... targetStates) {
            boolean result = fromState == null || stateComparator.compare(this.fromState, fromState);
            result = result && (this.auto && targetStates.length == 0 || Arrays.stream(targetStates).anyMatch(targetState -> stateComparator.compare(this.toState, targetState) || stateComparator.compare(this.toState, targetState.preparingPhase()) || stateComparator.compare(this.toState, targetState.permitRequestedPhase())));
            result = result && this.predicate.test(this.toState, context);
            return result;
        }
    }

    public static interface VoidAction2<EE> {
        public void execute(EE var1);
    }

    public static interface VoidAction<S extends ManagedState<S>, EE> {
        public void execute(EE var1, S var2, S var3);
    }

    public static interface VoidPostAction<S extends ManagedState<S>, EE> {
        public void execute(EE var1, S var2, S var3, Permit<S> var4);
    }

    public static interface PostAction<S extends ManagedState<S>, EE> {
        public Object execute(EE var1, S var2, S var3, Permit<S> var4);
    }

    public static class Result {
        private boolean stateChanged;
        private S state;
        protected Object actionResult;
        final /* synthetic */ StateManager this$0;

        private Result(boolean stateChanged, S targetState) {
            this.this$0 = this$0;
            this.stateChanged = stateChanged;
            this.state = targetState;
        }

        public boolean isStateChanged() {
            return this.stateChanged;
        }

        public S getState() {
            return this.state;
        }

        public Object getActionResult() {
            return this.actionResult;
        }
    }

    public static interface StateComparator<S extends ManagedState<S>> {
        public boolean compare(S var1, S var2);
    }

    public class RuleBuilder<EE extends E> {
        private static final long DEFAULT_REQUEST_TIMEOUT = 10000L;
        private Aspect<S, EE> aspect;
        private S fromState;
        private S toState;
        private VoidAction<S, EE> prepareAction;
        private PostAction<S, EE> action;
        private BiPredicate<S, EE> predicate;
        private BiFunction<S, EE, Permit<S>> permitProvider;
        private BiFunction<S, EE, Boolean> stateUpdater;
        private PermitManager permitManager;
        private Predicate<EE> preparePredicate;
        private long requestTimeout = 10000L;
        private boolean isPermitRequired;

        public RuleBuilder(Aspect<S, EE> aspect) {
            this.aspect = aspect;
        }

        public RuleBuilder<EE> prepare(VoidAction<S, EE> prepareAction, Predicate<EE> preparePredicate) {
            this.prepareAction = prepareAction;
            this.preparePredicate = preparePredicate;
            return this;
        }

        public RuleBuilder<EE> change(S fromState) {
            this.fromState = fromState;
            return this;
        }

        public RuleBuilder<EE> to(S state) {
            this.toState = state;
            return this;
        }

        public RuleBuilder<EE> when(Predicate<EE> predicate) {
            this.predicate = (s, e) -> predicate.test(e);
            return this;
        }

        public RuleBuilder<EE> when(BiPredicate<S, EE> predicate) {
            this.predicate = predicate;
            return this;
        }

        public RuleBuilder<EE> withPermit(BiFunction<S, EE, Permit<S>> permitProvider, BiFunction<S, EE, Boolean> stateUpdater, PermitManager permitManager) {
            this.isPermitRequired = true;
            this.permitProvider = permitProvider;
            this.stateUpdater = stateUpdater;
            this.permitManager = permitManager;
            return this;
        }

        public RuleBuilder<EE> withAction(VoidPostAction<S, EE> action) {
            this.action = (context, from, to, permit) -> {
                action.execute(context, from, to, permit);
                return null;
            };
            return this;
        }

        public RuleBuilder<EE> withAction(VoidAction2<EE> action) {
            this.action = (context, from, to, permit) -> {
                action.execute(context);
                return null;
            };
            return this;
        }

        public StateManager<S, E> automatic() {
            return this.addRule(true);
        }

        public StateManager<S, E> manual() {
            return this.addRule(false);
        }

        private StateManager<S, E> addRule(boolean auto) {
            boolean isRequestRuleAutoTransitioned;
            BiPredicate<ManagedState, ExtendedState> effectivePredicate;
            Object effectiveFromState;
            LinkedHashSet aspectRules = StateManager.this.contextRules.computeIfAbsent(this.aspect, c -> new LinkedHashSet());
            if (this.predicate == null) {
                this.predicate = (s, c) -> true;
            }
            if (this.action == null) {
                this.action = (c, f, t, p) -> null;
            }
            if (this.prepareAction != null || this.preparePredicate != null) {
                if (auto) {
                    throw new IllegalStateException("Prepared transition cannot be automatic");
                }
                TransitionRule<ManagedState, ExtendedState> prepareRule = new TransitionRule<ManagedState, ExtendedState>((ManagedState)this.fromState, (ManagedState)this.toState.preparingPhase(), (s, e) -> this.predicate.test(s, StateManager.safeCast(e)), (c, f, t, p) -> {
                    if (this.prepareAction != null) {
                        this.prepareAction.execute(StateManager.safeCast(c), f, t);
                    }
                    return null;
                }, false);
                aspectRules.add(prepareRule);
                effectiveFromState = this.toState.preparingPhase();
                effectivePredicate = (s, e) -> this.preparePredicate != null ? this.preparePredicate.test(StateManager.safeCast(e)) : true;
                isRequestRuleAutoTransitioned = true;
            } else {
                effectiveFromState = this.fromState;
                effectivePredicate = (s, e) -> this.predicate.test(s, StateManager.safeCast(e));
                isRequestRuleAutoTransitioned = false;
            }
            if (this.isPermitRequired) {
                if (auto) {
                    throw new IllegalStateException("Permitted transitions cannot be automatic");
                }
                TransitionRule<ManagedState, ExtendedState> requestPermitRule = new TransitionRule<ManagedState, ExtendedState>((ManagedState)effectiveFromState, (ManagedState)this.toState.permitRequestedPhase(), effectivePredicate, (s, f, t, p) -> {
                    this.permitManager.request(p != null ? p : this.permitProvider.apply(t, StateManager.safeCast(s)), s, this::applyPermit);
                    return null;
                }, isRequestRuleAutoTransitioned);
                aspectRules.add(requestPermitRule);
                TransitionRule<ManagedState, ExtendedState> rollbackRule = new TransitionRule<ManagedState, ExtendedState>((ManagedState)this.toState.permitRequestedPhase(), (ManagedState)this.fromState, (s, c) -> System.currentTimeMillis() > c.getStateUpdateTimestamp() + this.requestTimeout, (c, f, t, p) -> this.action.execute(StateManager.safeCast(c), f, t, p), true);
                aspectRules.add(rollbackRule);
            } else {
                TransitionRule<ManagedState, ExtendedState> directTransitionRule = new TransitionRule<ManagedState, ExtendedState>((ManagedState)effectiveFromState, (ManagedState)this.toState, effectivePredicate, (c, f, t, p) -> this.action.execute(StateManager.safeCast(c), f, t, p), auto);
                aspectRules.add(directTransitionRule);
            }
            return StateManager.this;
        }

        private void applyPermit(Permit<S> processedPermit, E updatedState) {
            Object updateToState = processedPermit.getStatus() == Permit.Status.GRANTED ? this.toState : this.fromState;
            logger.debug("Applying permit with status {} to {}, changing state to {}", (Object)processedPermit.getStatus(), updatedState, this.toState);
            if (this.stateUpdater.apply(updateToState, StateManager.safeCast(updatedState)).booleanValue()) {
                this.action.execute(StateManager.safeCast(updatedState), this.fromState, this.toState, processedPermit);
            }
        }
    }
}

