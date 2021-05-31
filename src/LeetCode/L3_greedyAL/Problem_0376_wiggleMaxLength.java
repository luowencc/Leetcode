package L3_greedyAL;

public class Problem_0376_wiggleMaxLength {
    public static int wiggleMaxLength(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int begin=0,up=1,down=2;
        int state=begin;
        int maxLength=1;
        for (int i = 1; i <nums.length ; i++) {
            switch (state) {
                case 0:
                    if (nums[i] > nums[i - 1]) {
                        state = up;
                        maxLength++;
                    } else if (nums[i] > nums[i - 1]) {
                        state = down;
                        maxLength++;
                    }
                    break;
                case 1:
                    if (nums[i] < nums[i - 1]) {
                        state = down;
                        maxLength++;
                    }
                    break;
                case 2:
                    if (nums[i] > nums[i - 1]) {
                        state = up;
                        maxLength++;
                    }
                    break;
            }
        }
        return  maxLength;
    }
    public int wiggleMaxLength1(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int[] up = new int[n];
        int[] down = new int[n];
        up[0] = down[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up[i] = Math.max(up[i - 1], down[i - 1] + 1);
                down[i] = down[i - 1];
            } else if (nums[i] < nums[i - 1]) {
                up[i] = up[i - 1];
                down[i] = Math.max(up[i - 1] + 1, down[i - 1]);
            } else {
                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }
        return Math.max(up[n - 1], down[n - 1]);
    }

    public static void main(String[] args) {
        int[] nums={1,2,1,3};
        System.out.println(wiggleMaxLength(nums));

    }
}
