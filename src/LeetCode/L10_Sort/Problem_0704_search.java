package L10_Sort;

public class Problem_0704_search {
    public static int search(int[] nums, int target) {
        int begin=0,end=nums.length-1,mid;
        while(begin<=end){
            mid=begin+(end-begin)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else {
                begin=mid+1;
            }
            //如果end=mid,或者begin=mid会出现超出时间限制
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int target=3;
        System.out.println(search(nums,target));
    }
}
