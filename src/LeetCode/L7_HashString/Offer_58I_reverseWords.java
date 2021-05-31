package L7_HashString;
/*
(1)�ָ�+���������ַ����ָ�����б�������ú��������Ե�ʱ�򲻽���ʹ��
(2)˫ָ�뷽��
�㷨������
��������ַ��� ss ����¼�������������߽� ii , jj ��
ÿȷ��һ�����ʵı߽磬��������������б� resres ��
���գ��������б�ƴ��Ϊ�ַ����������ؼ��ɡ�
���Ӷȷ�����
ʱ�临�Ӷ� O(N)O(N) �� ���� NN Ϊ�ַ��� ss �ĳ��ȣ����Ա����ַ�����
�ռ临�Ӷ� O(N)O(N) �� �½��� list(Python) �� StringBuilder(Java) �е��ַ����ܳ��� \leq N��N ��ռ�� O(N)O(N) ��С�Ķ���ռ䡣

���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/solution/mian-shi-ti-58-i-fan-zhuan-dan-ci-shun-xu-shuang-z/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
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
            while(i>=0 && s.charAt(i)!=' ') i--;//�����׸��ո�
            res.append(s.substring(i+1,j+1)+" ");//��ӵ���
            while(i>=0 && s.charAt(i)!=' ') i--;//�������ʼ�Ŀո�
            j=i;
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("   I   am    good  "));
        System.out.println(reverseWords1("   I   am    good  "));
    }
}

