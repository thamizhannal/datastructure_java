package com.algorithm.stack;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> list;
    private int size;
    private int top;

    public MyStack() {
        this.list = new ArrayList<>();
        // Assume max size a stack can hold was 10 elements.
        this.size = 10;
        this.top = -1;
    }

    public void push(T t) {
        // check stack is not empty
        if ( this.top +1 == this.size) {
            System.out.println("Stack is Full!" + list.size());
        }
        list.add(t);
        top += 1;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        }
        list.remove(top);
        top = top -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public T top() {
        if  (top == -1) {
            System.out.println("Stack is empty!");
        }
        return this.list.get(top);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public ArrayList<T> getList() {
        return list;
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        // Adding Integer elements
        stack.push(10);
        System.out.println("After pust=> 10 Top is "+ stack.getTop());
        stack.push(20);
        stack.push(110);
        System.out.println("After pust=> 10 20 110 Top is "+ stack.getTop());
        System.out.println(stack.getList());

        stack.pop();
        System.out.println("After pop=> Top is "+ stack.getTop());
        System.out.println(stack.getList());
        System.out.println(stack.getSize());

        // Adding Float elements
        MyStack<Float> stack1 = new MyStack<>();
        System.out.println("Check Stack Empty: "+ stack1.isEmpty());

        stack1.push(10.11f);
        stack1.push(100.11f);
        stack1.push(20.11f);
        System.out.println("After pusk=> 10.11 100.11 20.11 Top is "+ stack.getTop());
        System.out.println(stack1.getList());

        stack1.pop();
        System.out.println("After pop=> Top is "+ stack.getTop());
        System.out.println(stack1.getList());
    }
}
