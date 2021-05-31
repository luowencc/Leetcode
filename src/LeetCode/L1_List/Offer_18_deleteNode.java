package L1_List;
//注意边界条件
public class Offer_18_deleteNode {
    //这个方法超出了时间限制
    public static ListNode deleteNode(ListNode head, int val){
        ListNode prehead=head;//防止删除的是第一个节点
        ListNode result=head;
        ListNode deleteNext=null;
        boolean isHead=true;//防止删除的是第一个节点
        while(head!=null){
            if(head.val!=val){
                prehead=head;
                head=head.next;
                isHead=false;
            }else{
                if (head.next != null) {
                    deleteNext=head.next;
                }
                //防止删除的是第一个节点
                if(isHead){
                    return deleteNext;
                }else{
                    prehead.next=deleteNext;
                }

            }
        }
        return result;
    }
    public static ListNode deleteNode1(ListNode head, int val){
        if(head==null) return null;
        if(head.val==val) return head.next;
        ListNode cur=head;
        while(cur.next!=null&&cur.next.val!=val){
            cur=cur.next;
        }
        if(cur.next!=null){
            cur.next=cur.next.next;
        }
        return head;
    }
    public ListNode deleteNode2(ListNode head, int val) {
        if(head.val == val) return head.next;
        ListNode pre = head, cur = head.next;
        while(cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if(cur != null) pre.next = cur.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode l = deleteNode(a, 1);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }
}
