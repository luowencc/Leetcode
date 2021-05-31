package L9_DP;

public class Sum_1_BinaryKnapsack {
    static double binaryKnapsack(int numItems, int[] w, double[] v, int capacity){
        int i,j;
        int MaxN=20;
        int MaxC=20;
        double [][]val=new double[MaxN][MaxC];
        for (i = 1; i < numItems; i++) {
            for (j = 0; j <=capacity; j++) {
                val[i][j]=val[i-1][j];
                if(j>=w[i]&&val[i-1][j]<val[i-1][j-w[i]]+v[i]){
                    val[i][j]=val[i-1][j-w[i]]+v[i];
                }
            }
        }
        return val[numItems-1][capacity];
    }
    //因为状态转移方程式只与前一个物品有关，所以只需要存储一行数组就可以，当物品过多时，可以
    //减少数组占用的空间
    static double binaryKnapsack1(int numItems, int[] w, double[] v, int capacity){
        int i,j;
        int MaxC=30;
        double []val=new double[MaxC];
        for (i = 0; i < numItems; i++) {
//            递推的时候要从大往小推，不然会覆盖之前的val[]数组的值
            for (j = capacity; j >=1; j--) {
                if(j>=w[i]){
                    val[j]=Math.max(val[i],val[j-w[i]]+v[i]);
                }
            }
        }

        return val[capacity];
    }
    //此方法的缺点在于：
//    算法要求所给物品的重量是整数
//    当背包容量C很大时，算法需要的时间和空间都比较大
//    dp[i][j]=max(dp[i-1][j],dp[i-1][j-w[i]]+c[i]]
//    dp[j]=max(dp[j],dp[j-w[i]]+c[i]]
    public static void main(String[] args) {
        int numItems=4;
        int []w={2,3,4,7};
        double [] v={1,3,5,9};
        int capacity=10;
        System.out.println(binaryKnapsack(numItems,w,v,capacity));
        System.out.println(binaryKnapsack1(numItems,w,v,capacity));
    }
}
