package com.corejava.generics;

public class GenBox<T> {
    private T t;
    public T get() {
        return this.t;
    }
    public void set(T t) {
        this.t = t;
    }
    GenBox(T t) {
        this.t = t;
    }
}

