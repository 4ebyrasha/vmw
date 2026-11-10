/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.vicmatskiv.weaponlib;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Trees {
    public static <N> void writeBuf(ByteBuf buf, N root, BiConsumer<ByteBuf, N> writeContent, Function<N, List<N>> getChildren) {
        LinkedList queue = new LinkedList();
        Entry SENTINEL = new Entry();
        SENTINEL.name = "Sentinel";
        Entry rootEntry = new Entry();
        rootEntry.content = root;
        rootEntry.parentIndex = 0;
        queue.add(rootEntry);
        queue.add(SENTINEL);
        int counter = 0;
        while (!queue.isEmpty()) {
            Entry e = (Entry)queue.pollFirst();
            if (e == SENTINEL) {
                counter = 0;
                buf.writeByte(-1);
                continue;
            }
            buf.writeInt(e.parentIndex);
            writeContent.accept(buf, e.content);
            List<N> children = getChildren.apply(e.content);
            if (children.isEmpty()) continue;
            for (N n : children) {
                Entry c = new Entry();
                c.content = n;
                c.index = counter++;
                c.parentIndex = e.index;
                queue.addLast(c);
            }
            queue.addLast(SENTINEL);
        }
        buf.writeByte(-1);
    }

    public static <N> N readBuf(ByteBuf buf, Function<ByteBuf, N> reader, BiConsumer<N, N> attacher) {
        ArrayList<N> currentRow = new ArrayList<N>();
        ArrayList<N> previousRow = null;
        N root = null;
        while (true) {
            buf.markReaderIndex();
            if (buf.readByte() == -1) {
                if (currentRow.isEmpty()) break;
                previousRow = currentRow;
                currentRow = new ArrayList();
                continue;
            }
            buf.resetReaderIndex();
            int parentIndex = buf.readInt();
            N thisNode = reader.apply(buf);
            if (previousRow != null) {
                Object parentNode = previousRow.get(parentIndex);
                attacher.accept(parentNode, thisNode);
            } else {
                root = thisNode;
            }
            currentRow.add(thisNode);
        }
        return root;
    }

    private static class Entry<N> {
        N content;
        int index;
        int parentIndex;
        private String name;

        private Entry() {
        }

        public String toString() {
            return this.name != null ? this.name : this.content.toString();
        }
    }
}

