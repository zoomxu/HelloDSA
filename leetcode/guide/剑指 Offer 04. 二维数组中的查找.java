package cn.guide.huiwenchuan;

/**
 * ClassName: findNumberIn2DArray
 * Description: 剑指 Offer 04. 二维数组中的查找
 * date: 2020/8/21 23:25
 *
 * @author Luo
 * @since JDK 1.8
 */

/*
* 矩阵是有序的，从左下⻆来看，向上数字递减，向右数字递增，
* 因此从左下⻆开始查找，当要查找 数字比左下⻆数字大时: 右移
* 要查找数字比左下⻆数字小时: 上移。
* 这样找的速度最快。
 */

public class findNumberIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
        {1,   4,  7, 11, 15},
        {2,   5,  8, 12, 19},
        {3,   6,  9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
    };

        System.out.println(findNumberIn2DArray1(arr, 9));
    }

    public static boolean findNumberIn2DArray1(int[][] matrix, int target) {
        //行,最后一行开始
        int row = matrix.length-1;

        //列,从第0列开始
        int col = 0;

        while (row>=0 && col<=matrix[0].length-1){
            if (target<matrix[row][col]){
                row--;
            }else if (target>matrix[row][col]){
                col++;
            }else {
                return true;
            }
        }
        return false;

    }

}
