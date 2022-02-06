package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] arr = new int[0];
        int count = 0;
        boolean flag = true;
        for (int k : left) {
            if (left.length > 0) {
                flag = true;
            }
            if (right.length > 0) {
                for (int i : right) {
                    if (k == i) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                count++;
                arr = Arrays.copyOf(arr, count);
                arr[count - 1] = k;
            }
        }
        if (right.length > 0) {
            for (int k : right) {
                flag = true;
                for (int i : left) {
                    if (k == i) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                    arr = Arrays.copyOf(arr, count);
                    arr[count - 1] = k;
                }
            }
        }
        return arr;
    }
}