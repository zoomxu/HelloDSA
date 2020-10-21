package cn.leetcode.array;

/**
 * ClassName: leet1
 * Description: 转置矩阵
 * date: 2020/10/20 23:31
 *
 * @author Mr.Luo
 * @since JDK 1.8
 */
public class leet1 {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        A[0][0] = 1;
        A[0][1] = 2;
        A[0][2] = 3;

        A[1][0] = 4;
        A[1][1] = 5;
        A[1][2] = 6;

        A[2][0] = 7;
        A[2][1] = 8;
        A[2][2] = 9;

//        System.out.println(A.length);
//        System.out.println(A[0].length);
        int[][] transpose = new leet1().transpose(A);
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


    }

    public int[][] transpose(int[][] A) {
        int R = A.length;
        int C = A[0].length;
        int B[][] = new int[C][R];
        for(int r = 0; r < R; r++){
            for(int c = 0; c < C; c++){
                B[c][r] = A[r][c];
            }
        }
        return B;
    }
}
