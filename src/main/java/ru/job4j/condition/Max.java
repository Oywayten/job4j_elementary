package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public static int max(int pre, int left, int middle, int right) {
        return max(pre, max(left, middle, right));
    }

    public static void main(String[] args) {
        System.out.println(max(-105, 14));
    }
}
