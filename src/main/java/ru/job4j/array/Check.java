package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int count = 0;
        for (boolean datum : data) {
            if (datum) {
                count++;
            } else {
                count--;
            }
        }
        return Math.abs(count) == data.length;
    }
}
