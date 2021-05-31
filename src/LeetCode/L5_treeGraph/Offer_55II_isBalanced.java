package L5_treeGraph;
/*
先序遍历+深度判断：求子树的深度，是后序遍历
 */

public class Offer_55II_isBalanced {
    //  后序遍历
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        //先序遍历
        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right) ;
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

        System.out.println(isBalanced(a));
    }

}
