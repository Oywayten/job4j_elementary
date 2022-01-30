package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenData34125ThenSort12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenData105510ThenSort510105() {
        int[] data = new int[] {105, 5, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 10, 105};
        Assert.assertArrayEquals(expected, result);
    }
}
