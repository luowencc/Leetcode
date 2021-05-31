package L11_Array;
/*
��27��һ����ʹ��˫ָ������ʱ�临�Ӷ�ΪO(n)���ռ临�Ӷ�ΪO(1)
 */
public class Problem_0026_removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int slowIndex=1;
        int len=nums.length;
        if(len==0) return 0;
        for(int fastIndex=1;fastIndex<nums.length;fastIndex++){
            if(nums[fastIndex]!=nums[fastIndex-1]){
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
