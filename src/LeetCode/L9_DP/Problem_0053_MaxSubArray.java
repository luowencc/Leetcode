package L9_DP;
/*
确定状态：（1）dp[i]代表前i个数字组成的连续的最大子段和，并不能根据dp[i-1],dp[i-2]推导出来
         （2）dp[i]代表以第i个数字结尾的最大子段和，这样才能保证连续最大子段和
 */
public class Problem_0053_MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(maxSubArray(nums));
    }
}
