package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = new int[] {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int coin : coins) {
            while (change >= coin) {
                rsl[size] = coin;
                change -= coin;
                size += 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
