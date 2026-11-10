/*
 * Decompiled with CFR 0.152.
 */
package com.vicmatskiv.weaponlib;

import java.util.Deque;
import java.util.LinkedList;

public final class StatusMessageCenter {
    protected Deque<Message> messageQueue = new LinkedList<Message>();

    public void addMessage(String message) {
        this.addMessage(message, -1L);
    }

    public void addMessage(String message, long duration) {
        long expiresAt;
        long l = expiresAt = duration < 0L ? Long.MAX_VALUE : System.currentTimeMillis() + duration;
        while (!this.messageQueue.isEmpty()) {
            Message m = this.messageQueue.removeFirst();
            if (m.expiresAt <= expiresAt) continue;
            this.messageQueue.addFirst(m);
            break;
        }
        this.messageQueue.addFirst(new Message(message, expiresAt));
    }

    public void addAlertMessage(String message, int count, long duration, long pause) {
        long expiresAt = System.currentTimeMillis();
        this.messageQueue.clear();
        for (int i = 0; i < count; ++i) {
            this.messageQueue.addLast(new Message(message, expiresAt += duration, true));
            this.messageQueue.addLast(new Message("", expiresAt += pause));
        }
    }

    public Message nextMessage() {
        Message result = null;
        while (!this.messageQueue.isEmpty()) {
            Message m = this.messageQueue.removeFirst();
            if (m.expiresAt <= System.currentTimeMillis()) continue;
            result = m;
            this.messageQueue.addFirst(m);
            break;
        }
        return result;
    }

    public static class Message {
        long expiresAt;
        String message;
        boolean isAlert;

        public Message(String message, long expiresAt) {
            this(message, expiresAt, false);
        }

        public Message(String message, long expiresAt, boolean isAlert) {
            this.message = message;
            this.expiresAt = expiresAt;
            this.isAlert = isAlert;
        }

        public String getMessage() {
            return this.message;
        }

        public boolean isAlert() {
            return this.isAlert;
        }
    }
}

