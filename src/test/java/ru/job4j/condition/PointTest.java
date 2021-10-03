package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20then2() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32To82then5() {
        int x1 = 3, y1 = 2, x2 = 8, y2 = 2;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when105To2119then18() {
        int x1 = 10, y1 = 5, x2 = 21, y2 = 19;
        double expected = 17.8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To00then0() {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}