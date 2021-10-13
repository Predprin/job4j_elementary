package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot7ThenMinus1() {
        int[] data = {2, 16, -4, 8, 1, 0};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas1Then4() {
        int[] data = {2, 16, -4, 8, 1, 1};
        int el = 1;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind() {
        int[] data = new int[] {7, 2, 3, 4, 5, 6};
        int el = 7;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}