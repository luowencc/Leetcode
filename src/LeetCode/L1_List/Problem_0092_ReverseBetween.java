package L1_List;

public class Problem_0092_ReverseBetween {
    public static class  ListNode {
        int val;
        ListNode next=null;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseBetween(ListNode head,int m,int n) {
        ListNode result=head;
        ListNode phead=null;
        int length=n-m+1;
        while(head!=null && --m>0){
            phead=head;
            head=head.next;
        }
        ListNode modifyTail=head;
        //m到n的oldhead
        ListNode mnewhead=new ListNode();
        ListNode mnext=new ListNode();
        while(length>0){
            mnext=head.next;
            head.next=mnewhead;
            mnewhead=head;
            head=mnext;
            length--;
        }
        modifyTail.next=head;
        if(phead!=null){
            phead.next=mnewhead;
        }else{
            result=mnewhead;
        }
        return result;
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
        reverseBetween(a,2,4);
        while(a!=null){
            System.out.println(a.val);
            a=a.next;
        }
    }

}
