package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To2Then2() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To10To100Then100() {
        int left = 1;
        int middle = 10;
        int right = 100;
        int result = Max.max(left, middle, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax0To1To10To100Then100() {
        int pre = 0;
        int left = 1;
        int middle = 10;
        int right = 100;
        int result = Max.max(left, middle, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }
}