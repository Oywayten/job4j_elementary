package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] arr = new int[0];
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < left.length; i++) {
            if (left.length > 0) {
                flag = true;
            }
            if (right.length > 0) {
                for (int j = 0; j < right.length; j++) {
                    if (left[i] == right[j]) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                count++;
                arr = Arrays.copyOf(arr, count);
                arr[count - 1] = left[i];
            }
        }
        if (right.length > 0) {
            for (int i = 0; i < right.length; i++) {
                flag = true;
                for (int j = 0; j < left.length; j++) {
                    if (right[i] == left[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                    arr = Arrays.copyOf(arr, count);
                    arr[count - 1] = right[i];
                }
            }
        }
        return arr;
    }
}