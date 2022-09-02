package com.unlockprogramming.algorithms._02_two_pointers._001_backspace_string_compare;

import java.util.Stack;

public class BruteForce {

    public boolean backspaceCompare(String s, String t) {

        Stack<Character> sStack = backspaceWriter(s);

        Stack<Character> tStack = backspaceWriter(t);

        return sStack.equals(tStack);

    }

    private Stack<Character> backspaceWriter(String value) {
        Stack<Character> stack = new Stack<>();
        for (char c : value.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack;
    }

}
