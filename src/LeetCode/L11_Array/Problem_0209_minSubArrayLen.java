package L11_Array;
/*
数组中的滑窗思想：

 */
public class Problem_0209_minSubArrayLen {
    public static int minSubArrayLen(int s, int[] nums) {
        int start=0,end=0,sum=0,len=nums.length;
        if(len==0)return 0;
        int ans = Integer.MAX_VALUE;
        while(end<len){
            sum+=nums[end];
            while(sum>=s){
                ans=Math.min(ans,end-start+1);
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }

    public static void main(String[] args) {
        int s=4;
        int[] nums={1,2,2,3};
        System.out.println(minSubArrayLen(s, nums));
    }
}
