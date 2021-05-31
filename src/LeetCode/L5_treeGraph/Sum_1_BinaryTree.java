package L5_treeGraph;
/*
* 包含前、中、后、层次、z字形层次遍历（锯齿遍历）,不同的打印方法
* */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sum_1_BinaryTree {
    public static void main(String[] args) {
        //初始化数据
        int[] nums = new int[7];
        for (int i = 0;i<7;i++) {
            nums[i] = i;
        }
        //创建二叉树，并将根节点（root）保存
//        TreeNode root = tree.createTree(nums);
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

        //前序遍历（递归）
        System.out.println("PreOrder:");
        PreOrder(a);
        //中序遍历
        System.out.println("\nMiddleOrder:");
        MiddleOrder(a);
        //后序遍历
        System.out.println("\nPostOrder:");
        PostOrder(a);
        //层序遍历
        System.out.println("\nLevelOrder:");
        LevelOrder(a);
        //层序遍历,结果每行输出，即二维数据
        System.out.println("\nLevelOrderLinePrint:");
        System.out.println(LevelOrderLinePrint(a));
        //Z层序遍历
        System.out.println("\nZLevelOrder:");
        ZLevelOrder(a);
        //Z层序遍历，结果每行输出，即二维数据
        System.out.println("\nZLevelOrderLinePrint:");
        System.out.println(ZLevelOrderLinePrint(a));
    }

    //前序遍历
    private static void PreOrder(TreeNode root) {
        if (root != null) {
            System.out.printf(root.val+"\t");
            PreOrder(root.left);
            PreOrder(root.right);
        }

    }

    //中序遍历
    private static void MiddleOrder(TreeNode root) {
        if (root != null) {
            MiddleOrder(root.left);
            System.out.printf(root.val+"\t");
            MiddleOrder(root.right);
        }

    }

    //后序遍历
    private static void PostOrder(TreeNode root) {
        if (root != null) {
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.printf(root.val+"\t");
        }
    }
    //层序遍历，又称宽度优先搜索，使用队列对遍历节点进行存储，
    // 先进入队列的结点，优先遍历拓展其左孩子与右孩子
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
    private static  List<List<Integer>> LevelOrderLinePrint(TreeNode root){
        Queue<TreeNode> queue =new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            List <Integer> tmp=new ArrayList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode node=queue.poll();
                tmp.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
    //思路：z字形层次遍历是对层次遍历加上了一个限制条件（即相邻层，从左到右的遍历顺序相反），
    // 因此还是可以采用队列来实现，只不过节点接入队列时需要考虑加入的顺序
    private static void ZLevelOrder(TreeNode root){
        Queue<TreeNode> queue =new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        int depth=0;
        while(!queue.isEmpty()){
            LinkedList<Integer>tmp=new LinkedList<>();
            TreeNode node=queue.poll();
            if(depth==0){
                System.out.printf(node.val+"\t");//偶数层-》队列头部
            }else{
                System.out.printf(node.val+"\t");//奇数层-》队列尾部
            }
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }

        }
    }
    //双端队列进行实现：
    // 如果从左至右，我们每次将被遍历到的元素插入至双端队列的末尾
    //如果从右至左，我们每次将被遍历到的元素插入至双端队列的头部。
    //Java 中将链表 LinkedList 作为双端队列使用。
    private static List<List<Integer>> ZLevelOrderLinePrint(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            LinkedList<Integer>tmp=new LinkedList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode node=queue.poll();
                if(res.size()%2==0){
                    tmp.addLast(node.val);//偶数层-》队列头部
                }else{
                    tmp.addFirst(node.val);//奇数层-》队列尾部
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
    private static TreeNode createTree(int[] nums) {
        List<TreeNode> list = new ArrayList<>();//将元素（int）保存到TreeNode中，直接对元素(Treenood(int))进行树创建的操作
        for (int i = 0;i<nums.length;i++) {
            TreeNode node = new TreeNode(nums[i]);
            list.add(node);
        }
        TreeNode root;
        for (int i = 0;i<list.size()/2;i++) {//只用遍历到数组长度的一半
            root = list.get(i);//指向当前要进行操作（添加左右子节点）的节点
            TreeNode left = list.get(i * 2 + 1);//添加左子节点
            root.left = left;
            if (i * 2 + 2 < list.size()) {//需要判断是否已经添加完毕
                TreeNode right = list.get(i * 2 + 2);//添加右子节点
                root.right = right;
            }
        }
        return list.get(0);//返回根节点（因为二叉树是从List的第0个元素开始，即0处的元素为根节点）
    }
}




