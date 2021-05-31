package L1_List;


public class Problem_0206_ReverseList {

    public static class  ListNode {
        int val;
        ListNode next=null;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode reverseList(ListNode head) {
        ListNode newhead=new ListNode();
        ListNode next;
        while(head!=null){
            next=head.next;
            head.next=newhead;
            newhead=head;
            head=next;
        }
        return newhead;
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
        reverseList(a);
        while(a!=null){
            System.out.println(a.val);
            a=a.next;
        }
    }
}
