package L5_treeGraph;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Problem_0113_pathSum {
    private static List<List<Integer>> ret = new LinkedList<List<Integer>>();
    private static Deque<Integer> path = new LinkedList<Integer>();
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return ret;
    }

    public static void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
        path.pollLast();
    }

    public static void main(String[] args) {
        TreeNode a=new TreeNode(5);
        TreeNode b=new TreeNode(4);
        TreeNode c=new TreeNode(8);
        TreeNode d=new TreeNode(11);
        TreeNode e=new TreeNode(13);
        TreeNode f=new TreeNode(4);
        TreeNode g=new TreeNode(7);
        TreeNode h=new TreeNode(2);
        TreeNode x=new TreeNode(5);
        TreeNode y=new TreeNode(1);
        a.left=b;
        a.right=c;
        b.left=d;
        c.left=e;
        c.right=f;
        d.left=g;
        d.right=h;
        f.left=x;
        f.right=y;
        List<List<Integer>>  result=pathSum(a, 22);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i)+"\n");

        }
    }
}
