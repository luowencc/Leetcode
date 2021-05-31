package L1_List;
/*
����һ�������ж��������Ƿ��л���

�����������ĳ���ڵ㣬����ͨ���������� next ָ���ٴε���������д��ڻ��� Ϊ�˱�ʾ���������еĻ�������ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ���� ��� pos �� -1�����ڸ�������û�л���ע�⣺pos ����Ϊ�������д��ݣ�������Ϊ�˱�ʶ�����ʵ�������

��������д��ڻ����򷵻� true �� ���򣬷��� false ��

���ף�

������ O(1)�������������ڴ�����������

��


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
