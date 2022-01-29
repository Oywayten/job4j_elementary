package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] newArr = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            newArr[i] = board[i][i];
        }
        return newArr;
    }

    public static boolean isWin(char[][] board) {
        char[] newArr = extractDiagonal(board);
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == 'X') {
               if (monoHorizontal(board, i) || monoVertical(board, i)) {
                   return true;
               }
            }
        }
        return false;
    }
}
