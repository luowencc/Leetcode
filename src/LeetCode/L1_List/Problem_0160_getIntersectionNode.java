package L1_List;

import java.util.HashSet;

/*
编写一个程序，找到两个单链表相交的起始节点。
简单
 */
public class Problem_0160_getIntersectionNode {
    public  static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set=new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while (headB!=null){
            if(set.contains(headB)==true){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
    public  static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int listA=getListLength(headA);
        int listB=getListLength(headB);
        if(listA>listB){
            headA=forwardList(headA,listA,listB);
        }else {
            headB=forwardList(headB,listB,listA);
        }
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }

    private static ListNode forwardList(ListNode head,int long_list,int short_list) {
        int gap=long_list-short_list;
        while(head!=null && gap!=0){
            head=head.next;
            gap--;
        }
        return head;
    }

    private static int getListLength(ListNode headA) {
        int len=0;
        while(headA!=null){
            headA=headA.next;
            len++;
        }
        return len;
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
        ListNode l=getIntersectionNode1(a,b);
        while(l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }
}
