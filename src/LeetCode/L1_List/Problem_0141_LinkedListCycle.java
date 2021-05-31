package L1_List;
/*
给定一个链表，判断链表中是否有环。

如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。

如果链表中存在环，则返回 true 。 否则，返回 false 。

进阶：

你能用 O(1)（即，常量）内存解决此问题吗？

简单


 */

import java.util.HashSet;

public class Problem_0141_LinkedListCycle {


	public static ListNode hasCycle(ListNode head) {
		HashSet<ListNode> set=new HashSet<>();
		while(head!=null){
			if(set.contains(head)){
				return head;
			}
			set.add(head);
			head=head.next;
		}
		return null;
	}

	public static ListNode getFirstLoopNode(ListNode head) {
		if (head == null || head.next == null || head.next.next == null) {
			return null;
		}
		ListNode slow = head.next;
		ListNode fast = head.next.next;
		while (slow != fast) {
			if (fast.next == null || fast.next.next == null) {
				return null;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		fast = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
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
		ListNode l=hasCycle(a);
		while(l!=null){
			System.out.println(l.val);
			l=l.next;
		}
	}

}
