package L2_Queue;
/*
用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
分别完成在队列尾部插入整数和在队列头部删除整数的功能。
(若队列中没有元素，deleteHead 操作返回 -1 )



 */


import java.util.Deque;
import java.util.LinkedList;

public class Offer_09_CQueue {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public Offer_09_CQueue () {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        // 如果第二个栈为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }


    public static void main(String[] args) {
        Offer_09_CQueue cqueue=new Offer_09_CQueue();
        cqueue.appendTail(1);
        cqueue.appendTail(2);
        System.out.println(cqueue.deleteHead());
    }
}
