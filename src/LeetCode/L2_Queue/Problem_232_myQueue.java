package L2_Queue;

import java.util.Deque;
import java.util.LinkedList;

/*
请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：

实现 MyQueue 类：

void push(int x) 将元素 x 推到队列的末尾
int pop() 从队列的开头移除并返回元素
int peek() 返回队列开头的元素
boolean empty() 如果队列为空，返回 true ；否则，返回 false

将一个栈当作输入栈，用于压入 push 传入的数据；另一个栈当作输出栈，用于 pop 和 peek 操作。
每次 pop 或 peek 时，若输出栈为空则将输入栈的全部数据依次弹出并压入输出栈，
这样输出栈从栈顶往栈底的顺序就是队列从队首往队尾的顺序。


 */
public class Problem_232_myQueue {
    Deque<Integer> inStack;
    Deque<Integer> outStack;
    /** Initialize your data structure here. */
    public Problem_232_myQueue() {
        inStack = new LinkedList<Integer>();
        outStack = new LinkedList<Integer>();
    }
    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(outStack.isEmpty()){
            in2out();
        }
        return outStack.pop();
    }
    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }


    /** Get the front element. */
    public int peek() {
        if(outStack.isEmpty()){
            in2out();
        }
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    public static void main(String[] args) {
        Problem_232_myQueue myqueue=new Problem_232_myQueue();
        myqueue.push(1);
        myqueue.push(2);
        myqueue.push(3);
        System.out.println(myqueue.peek());
    }
}
