package L7_HashString;

public class Problem_0409_LongestPalindrome {
    public static int longestPalindrome(String s) {
        int char_map[]=new int[]{0};
        int max_length=0;
        char ss[]=s.toCharArray();
        int flag=0;
        for(int i=0;i<ss.length;i++){
            char_map[ss[i]]++;
        }
        for(int i=0;i<128;i++){
            if(char_map[i]%2==0){
                max_length+=char_map[i];
            }else{
                max_length+=char_map[i]-1;
                flag=1;
            }
        }
        return max_length+flag;
    }
    public static void main(String[] args) {
        String s="aab";
        System.out.println(longestPalindrome(s));
    }
}
