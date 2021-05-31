package L5_treeGraph;
/*
�������+����жϣ�����������ȣ��Ǻ������
 */

public class Offer_55II_isBalanced {
    //  �������
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        //�������
        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right) ;
    }

    public static void main(String[] args) {
        //�Լ�����һ��������
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(6);
        TreeNode g=new TreeNode(7);
        TreeNode h=new TreeNode(8);
        TreeNode x=new TreeNode(9);
        TreeNode y=new TreeNode(10);
        TreeNode z=new TreeNode(11);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        d.left=h;
        d.right=x;
        f.left=y;
        f.right=z;

        System.out.println(isBalanced(a));
    }

}
