package L4_RecursionDivide;

import java.util.ArrayList;
import java.util.List;

public class Problem_0078_subsets {
    private static List<Integer> t = new ArrayList<Integer>();
    private static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    //递归+回溯思想
    public static List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return ans;
    }
    public static void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<Integer>(t));
            return;
        }
        t.add(nums[cur]);
        dfs(cur + 1, nums);
        t.remove(t.size() - 1);
        dfs(cur + 1, nums);
    }
    public static void main(String[] args) {
        int [] nums={1,2};
        System.out.println(subsets(nums));
    }
}
