package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return left >= max(middle, right) ? left : max(middle, right);
    }

    public static int max(int pre, int left, int middle, int right) {
        return pre >= max(left, middle, right) ? pre : max(left, middle, right);
    }

    public static void main(String[] args) {
        System.out.println(max(-105, 14));
    }
}
