package L5_treeGraph;

public class Offer_28_isSymmetric {
    public static boolean isSymmetric(TreeNode root) {
       return root==null?true:recur(root.left,root.right);
    }
    public static boolean recur(TreeNode L, TreeNode R) {
        if(L==null && R==null)return true;
        if(L==null || R==null ||L.val!=R.val) return  false;
        return recur(L.left,R.right) && recur(R.right,L.left);
    }

    public static void main(String[] args) {
        //自己定义一个二叉树
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
        System.out.println(isSymmetric(a));

    }
}
