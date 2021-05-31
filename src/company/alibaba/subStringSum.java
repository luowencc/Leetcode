package alibaba;
/*
数组a[i]，求所有子串的最大值和最小值差的和是多少
3
1 2 3
输出：4

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class subStringSum {
    public static void subSum(int n,int [] arr){
        int maxm[][] = new int[n][n];
        int minm[][] = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for(int j=i;j<n;j++){
                if(i==j){
                    maxm[i][j]=arr[i];
                }
                else{
                    maxm[i][j]=Math.max(maxm[i][j-1],arr[i]);
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            for(int j=i;j<n;j++){
                if(i==j){
                    minm[i][j]=arr[i];
                }
                else{
                    minm[i][j]=Math.min(minm[i][j-1],arr[i]);
                }
            }
        }
        int sum=0;
        for (int i = 0; i <n ; i++) {
            for(int j=i;j<n;j++) {
                sum+=maxm[i][j]-minm[i][j];
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) throws IOException {
        InputStream in =System.in;
        BufferedReader reader=new BufferedReader(new InputStreamReader(in));
        String tmpn=reader.readLine();
        int n =Integer.parseInt(tmpn);
        String array=reader.readLine();
        String [] a=array.split(" ");
        int []arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=Integer.parseInt(a[i]);
        }
        subSum(n,arr);
    }
}
