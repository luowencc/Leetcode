package L9_DP;

public class Sum_2_CompleteKnapsack {
//    朴素的思想：
    static double completeKnapsack(int numItems, int[] w, double[] v, int capacity){
        int i,j;
        int MaxN=20;
        int MaxC=20;
        double [][]val=new double[MaxN][MaxC];
        for (i = 1; i < numItems; i++) {
            for (j = 0; j <=capacity; j++) {
                val[i][j]=val[i-1][j];
                for(int k=0;k<=j/w[i];k++){
                    if(j>=w[i]&&val[i-1][j]<val[i][j-k*w[i]]+k*v[i]){
                        val[i][j]=val[i][j-k*w[i]]+k*v[i];
                    }
                }

            }
        }
        return val[numItems-1][capacity];
    }
    static double completeKnapsack1(int numItems, int[] w, double[] v, int capacity){
        int i,j;
        int MaxC=20;
        double []val=new double[MaxC];
        for (i = 0; i < numItems; i++) {
            for (j = 0; j <=capacity; j++) {
                if(j>=w[i]){
                    val[j]=Math.max(val[j],val[j-w[i]]+v[i]);
                }


            }
        }
        return val[capacity];
    }
//  改进思想：

    public static void main(String[] args) {
        int numItems=4;
        int []w={2,3,4,7};
        double [] v={1,3,5,9};
        int capacity=10;
        //max=12
        System.out.println(completeKnapsack(numItems,w,v,capacity));
        System.out.println(completeKnapsack1(numItems,w,v,capacity));
    }
}
