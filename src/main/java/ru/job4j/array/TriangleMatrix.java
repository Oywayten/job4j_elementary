package ru.job4j.array;

import java.util.Arrays;

public class TriangleMatrix {
    public static void main(String[] args) {
        int count = 2;

        int[][] triangle = new int[count][];
        int numCounter = 0;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {

                //triangle[i] = Arrays.copyOf(triangle[i], j + 1);
                numCounter++;
                triangle[i][j] = numCounter;

            }
        }

            for (int[] elem : triangle) {
                System.out.println();
                for (int cell : elem) {
                    System.out.print(cell);
                }
            }
        }
    }