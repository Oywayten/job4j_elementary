package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short hight) {
        return (hight - 100) * 1.15;
    }

    public static double womanWeight(short hight) {
        return (hight - 110) * 1.15;
    }

    public static void main(String[] args) {
        short hight = 187;
        double man = Fit.manWeight(hight);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight(hight);
        System.out.println("Woman 187 is " + woman);
    }
}