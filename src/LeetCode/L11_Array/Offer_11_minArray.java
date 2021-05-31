package L11_Array;
/*
����Ŀ�����ظ������ֵģ����ֲ�����ı�һ���뷨�����ҵ�����С���ҵķ�Χ������+���ֽ��
leetcode153��������û���ظ�������
leetcode154�����������ظ�������

 */
public class Offer_11_minArray {
    public static int minArray(int[] numbers) {
        int begin=0,end=numbers.length-1,mid;
        while(begin<end){
            mid=begin+(end-begin)/2;//low + (high - low) // 2 ������ (high + low) // 2,�����
            if(numbers[mid]<numbers[end]){
                end=mid;//mid��Ӧ�Ŀ�������Сֵ�����Բ���-1
            }
            else if(numbers[mid]>numbers[end]){
                begin=mid+1;//mid��Ӧ��һ��������Сֵ�����Կ���+1
            }else{
                //���ظ�Ԫ�أ������ж��ǲ�����Сֵ����ʱ���޷����֣����Ա�������С��Χ
                end--;//Ϊʲô����Խ������Ӱ��?
            }
        }
        return numbers[begin];
    }

    public static void main(String[] args) {
        int[] numbers={3,4,4,1,2};
        System.out.println(minArray(numbers));
    }
}
