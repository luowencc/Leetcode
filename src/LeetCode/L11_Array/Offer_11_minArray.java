package L11_Array;
/*
此题目是有重复的数字的：二分查找需改变一点想法，从右到左缩小查找的范围，暴力+二分结合
leetcode153中数组中没有重复的数字
leetcode154中数组中有重复的数字

 */
public class Offer_11_minArray {
    public static int minArray(int[] numbers) {
        int begin=0,end=numbers.length-1,mid;
        while(begin<end){
            mid=begin+(end-begin)/2;//low + (high - low) // 2 而不是 (high + low) // 2,怕溢出
            if(numbers[mid]<numbers[end]){
                end=mid;//mid对应的可能是最小值，所以不能-1
            }
            else if(numbers[mid]>numbers[end]){
                begin=mid+1;//mid对应的一定不是最小值，所以可以+1
            }else{
                //有重复元素，则不能判定是不是最小值，这时候，无法二分，可以暴力的缩小范围
                end--;//为什么不会对结果产生影响?
            }
        }
        return numbers[begin];
    }

    public static void main(String[] args) {
        int[] numbers={3,4,4,1,2};
        System.out.println(minArray(numbers));
    }
}
