package day_48_Collections;

import java.util.Objects;
import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {
        Stack<Object> stack= new Stack<>();
        stack.add(true);
        stack.add(5);
        stack.add("merhaba");
        stack.add('c');
        stack.add(8.8);

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());

    }
}
