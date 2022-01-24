package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int out = Factorial.calc(5);
        int exepted = 120;
        Assert.assertEquals(exepted, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int out = Factorial.calc(0);
        int exepted = 1;
        Assert.assertEquals(exepted, out);
    }
}