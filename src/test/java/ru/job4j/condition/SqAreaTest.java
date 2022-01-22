package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenSquare2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP0K2ThenSquare0() {
        double p = 0;
        double k = 2;
        double expected = 0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K0ThenSquare0() {
        double p = 3;
        double k = 0;
        double expected = 0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP30K20ThenSquare10Dot20() {
        double p = 30;
        double k = 20;
        double expected = 10.2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
