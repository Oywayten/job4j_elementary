package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(temp.charAt(temp.length() - 1 - i)));
        }
        return  numbers;
    }
}