package com.algoritham.stack;

import java.util.Stack;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Class demonstrate Stack operations.
 */
public class StackDemo {

    private Stack stack;

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }
    StackDemo() {
        stack = new Stack<String>();
    }

    public void pushItem(String obj) {
        getStack().push(obj);
    }

    public void peekItem() {
        System.out.println(getStack().peek());
    }

    public void popItem() {
        getStack().pop();
    }

    public int searchItem(String obj) {
       return  getStack().search(obj);
    }

    public int getSize() {
        return stack.size();
    }

    public void iterateItems() {
        System.out.println("Stack output:");
        Iterator iterator = getStack().iterator();
        while(iterator.hasNext()){
            Object value = iterator.next();
            System.out.println(value);
        }
    }

    public void processStackStream() {
        Stream stream = getStack().stream();

        stream.forEach((element) -> {
            System.out.println(element);  // print element
        });
    }


    public static void main(String[] args) {
        StackDemo myStack = new StackDemo();
        // Adding elements to stack
        System.out.println("Pust: 10 ABC 89 xyz");
        myStack.pushItem("10");
        myStack.pushItem("ABC");
        myStack.pushItem("89");
        myStack.pushItem("xyz");


        // print stack
        myStack.iterateItems();

        System.out.println("Pop: ");
        myStack.popItem();

        // print stack

        myStack.iterateItems();

        System.out.println("Peek()=>");
        myStack.peekItem();

        // print stack
        myStack.iterateItems();



    }
}
