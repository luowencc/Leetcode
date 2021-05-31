package L5_treeGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
请完成一个函数，输入一个二叉树，该函数输出它的镜像。
使用递归或者辅助栈来进行解决问题
 */
public class Offer_27_mirrorTree {
    public static TreeNode mirrorTree(TreeNode root) {
        if(root==null) return null;
        Stack<TreeNode> stack=new Stack();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node.left!=null){
                stack.add(node.left);
            }
            if(node.right!=null){
                stack.add(node.right);
            }
            TreeNode tmp=node.left;
            node.left=node.right;
            node.right=tmp;
        }
        return root;
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
        TreeNode tmp=mirrorTree(a);
        LevelOrder(tmp);
    }
    private static void LevelOrder(TreeNode root){
        Queue<TreeNode> q =new LinkedList<>();
        TreeNode current;
        q.add(root);
        while(!q.isEmpty()){
            current=q.poll();//出队队头元素并访问
            System.out.printf(current.val+"\t");
            if(current.left != null)//如果当前节点的左节点不为空入队
            {
                q.offer(current.left);
            }
            if(current.right != null)//如果当前节点的右节点不为空，把右节点入队
            {
                q.offer(current.right);
            }


        }
    }

}
