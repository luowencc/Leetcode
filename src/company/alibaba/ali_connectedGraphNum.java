package alibaba;

import java.util.Arrays;
import java.util.Random;

/*
����n���㣬����֮�䶼�бߣ�Ҳ������n*(n-1)/2����
�ٸ���m�����ԣ���ʾ���m����
�ʻ�ʣ���ٸ���ͨͼ��ÿ����ͨͼ�ж��ٸ����
���룺n,m=[5,5]
l=[[1,2],[3,4],[3,2],[4,2],[2,5]]
�����
2
1 4
 */
public class ali_connectedGraphNum {
    //����һ����ʶ���飬0��ʾδ�����ֵĽڵ㣬1��ʾ�ѱ����ֵĽڵ㣬2��ʾ�ڽӱ�������Ľڵ�
    private static int[] color;
    //��¼��ͨͼ�ĸ���
    private static int count = 0;
    //��������
    public void DFS_visit(int[][] array,int n){
        //�ڵ�n�Ѳ���
        color[n]=1;
        System.out.println(Arrays.toString(color));
        //��n����������n�����Ľڵ�
        for(int i = n;i<array.length;i++){
            for(int j = 0;j<array.length;j++){
                if(array[n][j]==1){
                    if(color[j]==0){
                        DFS_visit(array,j);
                    }
                }
            }
        }
        color[n]=2;
        System.out.println(Arrays.toString(color));
        //�������δ�ӡcolor������Ϊ����ʾ�������̣���ĳһ�δ�ӡ������ֻ��2��0ʱ����ʾ������һ���Ѿ�������ϵ���ͨͼ
    }

    public ali_connectedGraphNum(int[][] graph){
        //��ʼ��color���飬��ʾ������ͼ�����нڵ㶼û�в��ҹ�
        for(int i = 0;i<graph.length;i++){
            color[i]=0;
        }
        //ͼ�ı���
        for(int j = 0;j<graph.length;j++){
            if(color[j]==0){
                //ÿ��ִ������2�д��룬��ʾ���һ����ͨͼ
                count++;
                DFS_visit(graph,j);
            }
        }
    }
    /**
     * ������
     */
    public static void main(String[] args) {
        //����һ��1,2,3��4,5,6�Ļ�
        int[][] map1 = new int[][]{
                {0,1,0},
                {1,0,0},
                {0,0,0},
        };
        int[][] map = new int[][]{
                {0,1,0,0,0,0},
                {1,0,0,0,0,0},
                {0,0,0,1,0,0},
                {0,0,1,0,0,0},
                {0,0,0,0,0,1},
                {0,0,0,0,1,0}};
        //�����������
        int[][] map2 = createRandomBArray();
        //��ӡ
        print(map2);
        System.out.println("���������2ά�����У��кź��кű�ʾ2���ڵ㣬���Ƕ�Ӧ�����ݱ�ʾ���ǵ����������0��ʾ�������ڵ�δ��ͨ��1��ʾ�������ڵ���ͨ");
        //0��ʾδ�����ֵĽڵ㣬1��ʾ�ѱ����ֵĽڵ㣬2��ʾ�ڽӱ�������Ľڵ�
        color = new int[map2.length];
        System.out.println("����ͼ�������������:");
        new ali_connectedGraphNum(map2);
        System.out.println("��ͨͼ����Ϊ:"+count);
    }
    //����һ�������2ά����
    private static int[][] createRandomBArray() {
        Random ra= new Random();
        int n = ra.nextInt(5)+4;
        int[][] Barray= new int[n][n];
        for(int k = 0;k<n;k++){
            Barray[k][k]=0;
        }
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<n;j++){
                if(i!=j){
                    if(j>i){
                        if(Math.random()<0.5)
                            Barray[i][j]= 1;
                        else Barray[i][j]= 0;
                    }else Barray[i][j]=Barray[j][i];
                }
            }
        }
        return 	Barray;
    }
    //��ӡ��ά����
    public static void print(int[][] c){
        for(int i=0;i<c.length;i++ ){
            for(int j=0;j<c.length;j++ ){
                if(c[i][j]==0)
                    System.out.print(c[i][j]+"\t");
                else
                    System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
