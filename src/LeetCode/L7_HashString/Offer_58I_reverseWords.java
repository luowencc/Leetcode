package L7_HashString;
/*
(1)分割+倒序：利用字符串分割函数和列表倒序的内置函数，面试的时候不建议使用
(2)双指针方法
算法解析：
倒序遍历字符串 ss ，记录单词左右索引边界 ii , jj ；
每确定一个单词的边界，则将其添加至单词列表 resres ；
最终，将单词列表拼接为字符串，并返回即可。
复杂度分析：
时间复杂度 O(N)O(N) ： 其中 NN 为字符串 ss 的长度，线性遍历字符串。
空间复杂度 O(N)O(N) ： 新建的 list(Python) 或 StringBuilder(Java) 中的字符串总长度 \leq N≤N ，占用 O(N)O(N) 大小的额外空间。

作者：jyd
链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/solution/mian-shi-ti-58-i-fan-zhuan-dan-ci-shun-xu-shuang-z/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer_58I_reverseWords {
    public static String reverseWords(String s) {
        String [] strs=s.trim().split(" ");
        StringBuilder res=new StringBuilder();
        for (int i = strs.length-1; i >=0 ; i--) {
            if(strs[i].equals("")) continue;
            res.append(strs[i]+" ");
        }
        return res.toString().trim();
    }
    public static String reverseWords1(String s) {
        s=s.trim();
        int j=s.length(),i=j;
        StringBuilder res =new StringBuilder();
        while (i>=0){
            while(i>=0 && s.charAt(i)!=' ') i--;//搜索首个空格
            res.append(s.substring(i+1,j+1)+" ");//添加单词
            while(i>=0 && s.charAt(i)!=' ') i--;//跳过单词间的空格
            j=i;
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("   I   am    good  "));
        System.out.println(reverseWords1("   I   am    good  "));
    }
}

