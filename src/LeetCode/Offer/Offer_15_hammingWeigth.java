package Offer;
/*
�� n \& 1 = 0n&1=0 ���� nn ������ ����һλ Ϊ 00 ��
�� n \& 1 = 1n&1=1 ���� nn ������ ����һλ Ϊ 11 ��
 */
public class Offer_15_hammingWeigth {
    public static int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}
