package L5_treeGraph;

import java.util.LinkedList;
import java.util.List;

/*
树的遍历方式总体分为两类：深度优先搜索（DFS）、广度优先搜索（BFS）；

常见的 DFS ： 先序遍历、中序遍历、后序遍历；递归+栈
常见的 BFS ： 层序遍历（即按层遍历）；队列


 */
public class Offer_55I_maxDepth {
//  后序遍历
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
//  层序遍历：每遍历一层，则计数器 +1+1 ，直到遍历完成，则可得到树的深度。
    public static int maxDepth1(TreeNode root) {
    if(root == null)
        return 0;
    List<TreeNode> queue = new LinkedList<>() , tmp;
    queue.add(root);
    int res = 0;
    while(!queue.isEmpty()) {
        tmp = new LinkedList<>();
        for(TreeNode node : queue) {
            if(node.left != null)
                tmp.add(node.left);
            if(node.right != null)
                tmp.add(node.right);
        }
        queue = tmp;
        res++;
    }
    return res;
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

        System.out.println(maxDepth(a));
        System.out.println(maxDepth1(a));

    }

}
