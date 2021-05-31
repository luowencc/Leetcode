package L5_treeGraph;

import org.apache.iotdb.tsfile.read.filter.operator.In;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
����ĳ��������ǰ���������������Ľ�������ؽ��ö�������
���������ǰ���������������Ľ���ж������ظ������֡�
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
