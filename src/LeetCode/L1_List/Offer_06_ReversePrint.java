package L1_List;

import java.util.ArrayList;
import java.util.List;

public class Offer_06_ReversePrint {
    public static class ListNode {
        int val;
        ListNode next=null;
        ListNode(int val) { this.val = val; }
    }
    public static void reversePrint(ListNode head){
        List<Integer> list = new ArrayList<Integer>();
        ListNode n=head;
        while(n!=null){
            list.add(n.val);
            n=n.next;
        }
        for (int i = list.size()-1; i >=0; i--) {
            System.out.println(list.get(i));
        }
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
        reversePrint(a);
    }
}
