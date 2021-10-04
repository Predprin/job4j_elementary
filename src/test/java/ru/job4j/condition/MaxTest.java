package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void when5to7then7() {
        int left = 5;
        int right = 7;
        int expected = 7;
        int maxNumber = Max.max(left, right);
        Assert.assertEquals(expected, maxNumber);
    }

    @Test
    public void when3to2then3() {
        int left = 3;
        int right = 2;
        int expected = 3;
        int maxNumber = Max.max(left, right);
        Assert.assertEquals(expected, maxNumber);
    }

    @Test
    public void when1to1then1() {
        int left = 1;
        int right = 1;
        int expected = 1;
        int maxNumber = Max.max(left, right);
        Assert.assertEquals(expected, maxNumber);
    }
}