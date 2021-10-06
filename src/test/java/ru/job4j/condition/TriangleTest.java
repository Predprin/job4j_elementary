package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {

    @Test
    public void whenExistTrue() {
        double ab = 1;
        double bc = 1;
        double ac = 1;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExistFalse() {
        double ab = 1;
        double bc = 3;
        double ac = 1;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(result);
    }
}