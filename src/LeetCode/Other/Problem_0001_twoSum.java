package Other;

import java.util.HashMap;
import java.util.Map;

/*
����һ������ö�٣�ʱ�临�Ӷȹ���O(n*n)
����������ϣ����⣺����Ѱ��target-nums[i]��ʱ�䣬��nums[i]Ϊkey,����Ϊvalue
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
