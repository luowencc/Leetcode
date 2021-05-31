package L11_Array;
/*

 */
public class Problem_0088_mergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,5,0,0};
        int m=2;
        int[] nums2={2,3};
        int n=2;
        merge(nums1,m,nums2,n);
        for (int i = 0; i <nums1.length ; i++) {
            System.out.print(nums1[i]+"\t");
        }
    }
}
