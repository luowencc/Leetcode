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
            //�ƶ�highָ�룬�������ұ�С��pivot��ֵ����pivot����
            while(low<high&&nums[high]>=pivot){
                high--;
            }
            //���
            if(low<high) nums[low]=nums[high];
            //�ٽ�����ߵ������ұߵĿӲ���
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
