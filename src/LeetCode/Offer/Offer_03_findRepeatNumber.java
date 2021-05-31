package Offer;

import java.util.HashSet;

public class Offer_03_findRepeatNumber {
    public static int findRepeatNumber(int[] nums) {
        HashSet set=new HashSet<>();
        int len=nums.length;
        int repeat=-1;
        while(len>=0){
            len--;
            if(!set.add(nums[len])){
                repeat=nums[len];
                break;
            }
        }
        return repeat;
    }

    public static void main(String[] args) {
        int [] nums={1,2,1};
        System.out.println(findRepeatNumber(nums));
    }
}
