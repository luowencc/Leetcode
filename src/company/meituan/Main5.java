package meituan;


/*
�����ַ���
ʱ�����ƣ� 3000MS
�ڴ����ƣ� 589824KB
��Ŀ������
С����С�Ÿ���һ����СдӢ����ĸ��ɵ��ַ������ֱ�Ϊs��t����Ϊ�����Ǻ����ѣ����ǲ����ñ˴����е��ַ�������ͬ��
����Ҫ��s��t�зֱ�ɾ�������ַ�(���Բ�ɾ����Ҳ��ȫ��ɾ��)��ʹ��������ȣ�
��ɾ���������ļ�ֵ�����һ���ַ����ļ�ֵΪ����ַ���ÿ���ַ���Ӧ��ֵ�ĺ͡�
��������
��һ��26���������ֱ����a������b�� ...... ��z���ַ���Ӧ�ļ�ֵ��

�ڶ���һ���ַ���s��

������һ���ַ���t��

�ַ���ֵ�ľ���ֵ��10^9��1��s��t�ĳ��ȡ�1000��

�������
���һ��һ����������𰸡�


��������
7 -5 4 6 2 5 8 -4 -8 4 10 -1 3 3 -5 10 7 0 -5 -4 -9 3 8 0 8 -3
nygfh
lixawy
�������
16
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
public class Main5 {
    public static int maxValue(int[] v, String s, String t){
        char c[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap <String,Integer>hash=new HashMap();
        for (int i = 0; i <26 ; i++) {
            hash.put(String.valueOf(c[i]),v[i]);
        }
        HashMap <String,Integer>sm=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            sm.put(String.valueOf(s.charAt(i)),i);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        InputStream in =System.in;
        BufferedReader reader=new BufferedReader(new InputStreamReader(in));
        String tmp=reader.readLine();
        String[] t1=tmp.split(" ");
        int []v=new int[26];
        for (int i = 0; i <26 ; i++) {
            v[i]=Integer.parseInt(t1[i]);
        }
        String s=reader.readLine();
        String t=reader.readLine();
        System.out.println(maxValue(v,s,t));
    }
}
