//package src.LuoType.L1_List;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//
///*
//（1）遍历+归并：时间复杂度太大
//（2）排序：将所有的数值加入数组，排序，然后再将值连起来
//（3）分治：
// */
//class MyComparator implements Comparator {
//    @Override
//    public int compare(Object o1, Object o2) {
//        ListNode a = (ListNode) o1;
//        ListNode b = (ListNode) o2;
//        if(a.val<b.val) {return 1;}
//        else if(a.val>b.val){return -1;}
//        else return 0;
//    }
//
//
//
//}
//public class Problem_0023_mergeKLists {
//
//    public ListNode mergeKLists(ListNode[] lists) {
//        ArrayList <ListNode> l = null;
//        ArrayList<Integer> li = null;
//        for (int i = 0; i <lists.length ; i++) {
//            ListNode head=lists[i];
//            while(head!=null){
//                l.add(head);
//                li.add(head.val);
//                head=head.next;
//            }
//        }
//        if(l.size()==0){
//            return null;
//        }
//        MyComparator mc=new MyComparator();
//        l.sort(l,mc);
//
//    }
//}
