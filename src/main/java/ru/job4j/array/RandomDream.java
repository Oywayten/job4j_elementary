package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        return (num > prizes.length) ? (num % prizes.length == 0 ? prizes[4] : prizes[num % prizes.length]) : prizes[num - 1];
    }
}