package L1_List;
/*
给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
说明：不允许修改给定的链表。
进阶：

你是否可以使用 O(1) 空间解决此题？
中等

证明：快慢指针
“快慢指针”的数学证明分两步：
“一定会相遇”的证明：慢指针一圈内必遇上
和“一定在环入口结点相遇”的证明：

 */
public class Problem_0142_detectCycleII {
    public static ListNode detectCycle(ListNode head){
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                //寻找入口节点
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=c;
        ListNode l=detectCycle(a);
        while(l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }
}
