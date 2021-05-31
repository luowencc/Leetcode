package L5_treeGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
�����һ������������һ�����������ú���������ľ���
ʹ�õݹ���߸���ջ�����н������
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
        TreeNode tmp=mirrorTree(a);
        LevelOrder(tmp);
    }
    private static void LevelOrder(TreeNode root){
        Queue<TreeNode> q =new LinkedList<>();
        TreeNode current;
        q.add(root);
        while(!q.isEmpty()){
            current=q.poll();//���Ӷ�ͷԪ�ز�����
            System.out.printf(current.val+"\t");
            if(current.left != null)//�����ǰ�ڵ����ڵ㲻Ϊ�����
            {
                q.offer(current.left);
            }
            if(current.right != null)//�����ǰ�ڵ���ҽڵ㲻Ϊ�գ����ҽڵ����
            {
                q.offer(current.right);
            }


        }
    }

}
