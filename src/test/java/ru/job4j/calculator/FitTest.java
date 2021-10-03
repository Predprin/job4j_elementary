package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180then92() {
        short in = 180;
        double expected = 92;
        double actual = Fit.manWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenWomen170Then69() {
        short in = 170;
        double expected = 69;
        double actual = Fit.womenWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }
}