package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP20K4Then16() {
        double p = 20;
        double k = 4;
        double expected = 16;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenP5K1Then15625() {
        double p = 5;
        double k = 1;
        double expected = 1.5625;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenP12K2Then8() {
        double p = 12;
        double k = 2;
        double expected = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }
}