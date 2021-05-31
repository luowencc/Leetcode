package L3_greedyAL;

import java.util.Arrays;

public class Problem_0445_FindContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int numOfChildren = g.length, numOfCookies = s.length;
        int count = 0;
        //按照孩子分糖果
        for (int i = 0, j = 0; i < numOfChildren && j < numOfCookies; i++, j++) {
            while (j < numOfCookies && g[i] > s[j]) {
                j++;
            }
            if (j < numOfCookies) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int g[]={1,2,3};
        int s[]={1,1};
        System.out.println(findContentChildren(g,s));
    }
}
