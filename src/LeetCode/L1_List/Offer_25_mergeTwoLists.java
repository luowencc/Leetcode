package L1_List;
/*
归并实现

 */
public class Offer_25_mergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode result=head;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                head.next=l1;
                l1=l1.next;
            }else{
                head.next=l2;
                l2=l2.next;
            }
            head=head.next;
        }
        if(l1!=null){
            head.next=l1;
        }
        if(l2!=null){
            head.next=l2;
        }
        return result.next;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);

        ListNode l=mergeTwoLists(a,b);
        while(l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }
}
