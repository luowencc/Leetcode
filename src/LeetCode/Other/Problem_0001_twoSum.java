package Other;

import java.util.HashMap;
import java.util.Map;

/*
方法一：暴力枚举：时间复杂度过高O(n*n)
方法二：哈希表求解：减少寻找target-nums[i]的时间，以nums[i]为key,索引为value
 */
public class Problem_0001_twoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashtable=new HashMap<Integer,Integer>();
        for (int i = 0; i <nums.length ; i++) {
            if(hashtable.containsKey(target-nums[i])){
                return new int[]{hashtable.get(target-nums[i]),i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[]nums={1,2,3};
        int target=3;
        System.out.println( twoSum(nums,target)[0]+"\t"+twoSum(nums,target)[1]);
    }
}
