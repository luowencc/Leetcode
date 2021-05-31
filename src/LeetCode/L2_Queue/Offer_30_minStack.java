package L2_Queue;

import java.util.Stack;

/*
辅助栈：
定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
调用 min、push 及 pop 的时间复杂度都是 O(1)。

用一个辅助栈来存储主栈的非严格降序的元素，设法维护好栈B的元素，使其保持非严格降序，
即可实现min函数的时间复杂度都是 O(1)

 */
public class Offer_30_minStack {
    Stack<Integer> A, B;
    public Offer_30_minStack() {
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

    public static void main(String[] args) {
        Offer_30_minStack minstack=new Offer_30_minStack();
        minstack.push(2);
        minstack.push(4);
        minstack.push(1);
        System.out.println(minstack.min());
        System.out.println(minstack.top());
    }
}
