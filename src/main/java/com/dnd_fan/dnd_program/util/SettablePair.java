package com.dnd_fan.dnd_program.util;

public class SettablePair<T1, T2> {
    private T1 mKey;
    private T2 mValue;

    public SettablePair(T1 key, T2 value) {
        this.mKey = key;
        this.mValue = value;
    }

    public T1 getKey() {
        return mKey;
    }

    public T2 getValue() {
        return mValue;
    }

    public synchronized void setKey(T1 mKey) {
        this.mKey = mKey;
    }

    public synchronized void setValue(T2 mValue) {
        this.mValue = mValue;
    }
}
