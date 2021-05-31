package L1_List;
//双指针
public class Offer_22_getKthFromEnd {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode klist=head;
        for (int i = 0; i <k ; i++) {
            head=head.next;
        }
        while(head!=null){
            klist=klist.next;
            head=head.next;
        }
        return klist;
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
        ListNode l=getKthFromEnd(a,3);
        while(l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }


}
