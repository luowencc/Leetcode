package Offer;
/*
方法一：申请空间，为3倍的空间
方法二：空间复杂度为O(1)，即双指针法
 */
public class Offer_05_replaceSpace {
    public static String replaceSpace(String s) {
        int length=s.length();
        char [] newStr=new char[length*3];
        int j=0;
        for (int i = 0; i <length ; i++) {
            if(s.charAt(i)==' '){
                newStr[j++]='%';
                newStr[j++]='2';
                newStr[j++]='0';
            }else{
                newStr[j++]=s.charAt(i);
            }
        }
        String news = new String(newStr, 0, j);
        return news;
    }
    public static void main(String[] args) {
        System.out.println(replaceSpace("I am you"));
    }
}
