package L2_Queue;

import java.util.Stack;

public class Interview_30_minstack {
    static class MinStack {
        Stack<Integer> A, B;
        public MinStack() {
            A = new Stack<>();
            B = new Stack<>();
        }
        public void push(int x) {
            A.add(x);
            if(B.empty() || B.peek() >= x)
                B.add(x);
        }
        public void pop() {
            if(A.pop().equals(B.peek()))
                B.pop();
        }
        public int top() {
            return A.peek();
        }
        public int min() {
            return B.peek();
        }
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(1);
        minStack.push(3);
        int min=minStack.min();
        System.out.println(min);
    }
}
