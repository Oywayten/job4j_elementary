package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class LogicNotTest {

    @Test
    public void when4ThenEvenTrue() {
        int in = 4;
        boolean expexted = true;
        boolean out = LogicNot.isEven(in);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when5ThenPositiveTrue() {
        int in = 5;
        boolean expexted = true;
        boolean out = LogicNot.isPositive(in);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when5ThenNotEvenTrue() {
        int in = 5;
        boolean expexted = true;
        boolean out = LogicNot.notEven(in);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void whenMinus4ThenNotPositiveTrue() {
        int in = -4;
        boolean expexted = true;
        boolean out = LogicNot.notPositive(in);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void when5ThenNotEvenAndPositiveTrue() {
        int in = 5;
        boolean expexted = true;
        boolean out = LogicNot.notEvenAndPositive(in);
        Assert.assertEquals(expexted, out);
    }

    @Test
    public void whenMinus4ThenEvenOrNotPositiveTrue() {
        int in = -4;
        boolean expexted = true;
        boolean out = LogicNot.evenOrNotPositive(in);
        Assert.assertEquals(expexted, out);
    }
}