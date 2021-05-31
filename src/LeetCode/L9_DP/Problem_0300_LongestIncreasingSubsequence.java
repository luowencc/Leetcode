package L9_DP;

public class Problem_0300_LongestIncreasingSubsequence {

	public static int lengthOfLIS(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int[] ends = new int[arr.length];
		ends[0] = arr[0];
		int right = 0;
		int l = 0;
		int r = 0;
		int m = 0;
		int max = 1;
		for (int i = 1; i < arr.length; i++) {
			l = 0;
			r = right;
			while (l <= r) {
				m = (l + r) / 2;
				if (arr[i] > ends[m]) {
					l = m + 1;
				} else {
					r = m - 1;
				}
			}
			right = Math.max(right, l);
			ends[l] = arr[i];
			max = Math.max(max, l + 1);
		}
		return max;
	}
	public static int lengthOfLIS1(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int[] dp = new int[arr.length];
		dp[0] = 1;
		int LIS = 1;
		for (int i = 1; i < arr.length; i++) {
			dp[i]=1;
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]&&dp[i]<dp[j]+1){
					dp[i]=dp[j]+1;
				}
			}
			if(LIS<dp[i]){
				LIS=dp[i];
			}
		}
		return LIS;
	}

	public static void main(String[] args) {
		int [] num={1,2,3,4,5};
		System.out.println(lengthOfLIS1(num));
	}
}
