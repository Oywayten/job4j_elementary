package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
        float[] prices = new  float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива names равен: " + names.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        names[0] = "Petr Arsentev";
        names[1] = "Иван Иванников";
        names[2] = "Антон Варламов";
        names[3] = "Джон Смирнов";
        System.out.println("В массиве содержаться имена: ");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
