package com.algorithm.stack;

import java.util.Deque;
import java.util.ArrayDeque;

/**
 * Stack is legacy class in Java which is not thread safe, alternative can be ArrayDequeue
 */
class ArrayDequeStack {

    public static void main(String[] args) {
        Deque<Character> stack = new ArrayDeque<Character>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
