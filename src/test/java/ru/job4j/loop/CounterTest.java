package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromMinusTenToZeroThenMinusThirty() {
        int start = -10;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = -30;
        Assert.assertEquals(expected, result);
    }
}