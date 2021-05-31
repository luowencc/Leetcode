package L9_DP;

import java.util.Arrays;
/*
贪心算法：在现实中的零钱还是可行的，但是出现不规则的零钱数，就成了不可行的了
动态规划：dp[i]代表金额i的最优解

 */
public class Problem_0322_CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int coin[]={1,2,3,4};
        System.out.println(coinChange(coin,1));
    }
}
