package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSortFiveNumbers() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] data = new int[] {30, 20, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortSevenNumbers() {
        int[] data = new int[] {11, 5, 17, 13, 3, 1, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 5, 7, 11, 13, 17};
        Assert.assertArrayEquals(expected, result);
    }
}