package m_jc1_143_23.testAssignments.test10;

import java.util.Scanner;
import java.util.Stack;

public class StackMax{
    private Stack<Integer> stack;
    private Stack<Integer> maxValues;

    public StackMax() {
        stack = new Stack<>();
        maxValues = new Stack<>();
    }

    public void push(int E) {
        stack.push(E);
        if (maxValues.isEmpty() || E >= maxValues.peek()) {
            maxValues.push(E);
        }
    }

    public Integer pop() {
        int value = stack.pop();
        if (value == maxValues.peek()) {
            maxValues.pop();
        }
        return value;
    }
    public int max() {
        return maxValues.peek();
    }

    @Override
    public String toString() {
        return "Стек: " + stack ;
    }
}
