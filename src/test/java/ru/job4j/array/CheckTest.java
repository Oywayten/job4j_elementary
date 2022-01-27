package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenAllisTrue() {
        boolean[] in = new boolean[]{true, true, true};
        boolean expected = true;
        boolean out = Check.mono(in);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenNotAllisTrue() {
        boolean[] in = new boolean[]{true, false, true};
        boolean expected = false;
        boolean out = Check.mono(in);
        Assert.assertEquals(out, expected);
    }
}