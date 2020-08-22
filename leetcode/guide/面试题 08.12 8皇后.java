package cn.guide.huiwenchuan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: queen
 * Description: 面试题 08.12 8皇后
 * date: 2020/8/21 20:21
 *
 * @author Luo
 * @since JDK 1.8
 */
public class queen {
    public static void main(String[] args) {
        System.out.println(solveQueens(4));
    }

    public static List<List<String>> solveQueens(int n){
        List<List<String>> res = new ArrayList<>();
        String[][] board = new String[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ".";
            }
        }
        backtrack(res,board,0);
        return res;

    }

    private static void backtrack(List<List<String>> res, String[][] board, int row) {
        if (row == board.length) {
            res.add(format(board));
            return;
        }

        int n = board.length;

        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }
            //选择
            board[row][col] = "Q";
            //回溯
            backtrack(res, board, row + 1);
            //撤销选择
            board[row][col] = ".";
        }
    }

    private static List<String> format(String[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                builder.append(board[i][j]);
            }
            res.add(builder.toString());
        }
        return res;
    }

    private static boolean isValid(String[][] board, int row, int col) {
        int n = board.length;
        //判断列是否有queen冲突
        for (int i = 0; i < n; i++) {
            if (board[i][col].equals("Q")) {
                return false;
            }
        }
        //判断右上方是否有queen冲突
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }
        //判断左上方是否有queen冲突
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }
        return true;
    }


}
