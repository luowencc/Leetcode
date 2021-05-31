package L10_Sort;

public class Problem_0912_quickSort {
    public static int[] sortArray(int[] nums){
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    public static void quickSort(int[] nums, int low, int high){
        if(low<high){
            int index=partition(nums,low,high);
            quickSort(nums,low,index-1);
            quickSort(nums,index+1,high);
        }
    }
    public static int partition(int[] nums, int low, int high){
        int pivot=nums[low];
        while(low<high){
            //移动high指针，将数据右边小于pivot的值填入pivot坑中
            while(low<high&&nums[high]>=pivot){
                high--;
            }
            //填坑
            if(low<high) nums[low]=nums[high];
            //再进行左边的数填右边的坑操作
            while(low<high&&nums[low]<pivot){
                low++;
            }
            if(low<high) nums[high]=nums[low];
        }
        nums[low]=pivot;
        return low;
    }

    public static void main(String[] args) {
        int [] nums={3,1,2,5};
        int [] anums=sortArray(nums);
        for (int i = 0; i <anums.length ; i++) {
            System.out.print(anums[i]+"\t");
        }
    }
}
