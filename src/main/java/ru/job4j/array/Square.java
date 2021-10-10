package ru.job4j.array;

public class Square {
    public static int[] calculated(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = index * index;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculated(4);
        for (int ind : array) {
            System.out.println(ind);
        }
    }
}
