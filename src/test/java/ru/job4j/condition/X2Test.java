package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* Ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* Вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* Ожидаемое значение. Это всегда одна переменная. */
        int expected = 3;
        /* Вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /* Ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* Вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /* Ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* Вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /* Ожидаемое значение. Это всегда одна переменная. */
        int expected = 1;
        /* Вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

}