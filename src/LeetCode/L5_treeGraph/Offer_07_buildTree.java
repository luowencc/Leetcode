package L5_treeGraph;

import org.apache.iotdb.tsfile.read.filter.operator.In;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class Offer_07_buildTree {
    HashMap<Integer,Integer> dic=new HashMap<>();
    int[] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for (int i = 0; i <inorder.length ; i++) {
            dic.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }
    TreeNode recur(int root, int left, int right){
        if(left>right)return null;
        TreeNode node=new TreeNode(preorder[root]);
        int i=dic.get(preorder[root]);
        node.left=recur(root+1,left,i-1);
        node.right=recur(root+i-left+1,i+1,right);
        return node;
    }

    public static void main(String[] args) {
        int[] preorder={1,2,4,5,3};
        int[] inorder={4,2,5,1,3};
        Offer_07_buildTree build=new Offer_07_buildTree();
        TreeNode tree=build.buildTree(preorder,inorder);
        LevelOrder(tree);
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
