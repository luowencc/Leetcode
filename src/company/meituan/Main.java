package meituan;
/*
Χ��
ʱ�����ƣ� 3000MS
�ڴ����ƣ� 1048576KB
��Ŀ������
С����С��Ҫ���,����Ҫ�ѼҾߴ�Χ���ϰ��ȥ.Χ����n��������ľ׮�ų�һ��ֱ�����,��i��ľ׮���Ϊi.������������������,ֻ��Խ���߶Ȳ�����h��Χ��.ͬʱ�Ҿ���Ҫ�п������,ֻ������m��ľ׮���ܰ��ȥ���ܳɹ����Ҿ߰��ȥ.����������֪�������ܷ�ɹ����.



��������
��һ����������n,m��h������������������

�ڶ���n��������height1,...,heightn�����α�ʾÿ��ľ׮�ĸ߶ȡ�

1��m��n��105,0��h,heighti��109��

�������
���һ�����������ܳɹ����,�����һ�������ľ׮�ı��,���ж���������С�ġ�����,�������-1��


��������
5 3 2
3 2 1 1 2
�������
2

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static int isMove(int n, int m, int h, int[] height){
        int start=0,end=0,i=0;
        while(i<n){
            if(height[i]<=h){
                end++;
                i++;
            }else{
                i++;
                start=i;
                end=i;
            }
            if(end-start+1>=m){
                return start+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) throws IOException {
        InputStream in =System.in;
        BufferedReader reader=new BufferedReader(new InputStreamReader(in));
        String tmp=reader.readLine();
        String[] t=tmp.split(" ");
        int n =Integer.parseInt(t[0]);
        int m =Integer.parseInt(t[1]);
        int h =Integer.parseInt(t[2]);
        String array=reader.readLine();
        String [] a=array.split(" ");
        int []height=new int[n];
        for (int i = 0; i <a.length ; i++) {
            height[i]=Integer.parseInt(a[i]);
        }
//        int h=System.in.read()-'0';
//        System.out.println(h);
//        int tmp=System.in.read()-'0';
//        System.out.println(tmp);
//        int n=5, m=3,h=2;
//        int []height={3,2,1,1,2};
        System.out.println(isMove(n,m,h,height));
    }
}
