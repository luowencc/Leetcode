package Offer;
/*
线性查找：
从右上角或者左下角开始查找，即一大一小的开始查找
 */
public class Offer_04_findNumberIn2DArray {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static boolean findNumberIn2DArray1(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = rows-1, column =0;
        while (row >=0 && column < columns) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                row--;
            } else {
                column++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix= {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19}};
        int target=5;
        System.out.println(findNumberIn2DArray1(matrix,target));
    }

}
