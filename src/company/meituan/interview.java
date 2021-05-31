package meituan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class interview {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        String line=reader.readLine();
//        String[] t=line.split(" ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        System.out.println(a);
        System.out.println(s);
//
//        int n =Integer.parseInt(t[0]);
//        int m =Integer.parseInt(t[1]);
//        int h =Integer.parseInt(t[2]);
//        String array=reader.readLine();
//        String [] a=array.split(" ");
//        int []height=new int[n];
//        for (int i = 0; i <a.length ; i++) {
//            height[i]=Integer.parseInt(a[i]);
//        }
    }
}
