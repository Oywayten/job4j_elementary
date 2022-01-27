package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[100500];
        float[] prices = new  float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива names равен: " + names.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}
