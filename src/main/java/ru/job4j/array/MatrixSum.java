package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int elem : array[i]) {
                rsl += elem;
            }
        }
        return rsl;
    }
}