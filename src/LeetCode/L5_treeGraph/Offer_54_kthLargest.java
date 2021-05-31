package L5_treeGraph;

public class Offer_54_kthLargest {
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0) res = root.val;
        dfs(root.left);
    }

    public static void main(String[] args) {
        TreeNode root = null;
        //自己定义一个二叉树
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(5);
        c.left=b;
        b.left=a;
        c.right=d;
        int k=3;
        Offer_54_kthLargest kt=new Offer_54_kthLargest();
        System.out.println(kt.kthLargest(root,k));
    }
}
