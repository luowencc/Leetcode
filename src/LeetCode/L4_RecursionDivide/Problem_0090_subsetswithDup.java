package L4_RecursionDivide;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem_0090_subsetswithDup {
    private static List<Integer> t = new ArrayList<Integer>();
    private static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    private static HashSet<List<Integer>> ansnoDup = new HashSet<List<Integer>>();

    //递归+回溯思想
    public static HashSet<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return ansnoDup;
    }
    public static void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<Integer>(t));
            ansnoDup.add(new ArrayList<>(t));
            return;
        }
        t.add(nums[cur]);
        dfs(cur + 1, nums);
        t.remove(t.size() - 1);
        dfs(cur + 1, nums);
    }
    public static void main(String[] args) {
        int [] nums={1,2,2};
        System.out.println(subsets(nums));
    }
}
