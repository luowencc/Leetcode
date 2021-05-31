package L11_Array;
// ʱ�临�Ӷȣ�O(n)
// �ռ临�Ӷȣ�O(1)
//����ָ��
public class Problem_0027_removeElement {
    public static int removeElement(int[] nums, int val) {
        int slowIndex=0;
        for(int fastIndex=0;fastIndex<nums.length;fastIndex++){
            if(val!=nums[fastIndex]){
                nums[slowIndex++]=nums[fastIndex];
            }
        }
        return slowIndex;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3}; int val=2;
        System.out.println(removeElement(nums,val));
    }
}
