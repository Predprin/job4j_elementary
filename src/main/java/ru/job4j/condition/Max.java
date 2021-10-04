package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int number1 = 80;
        int number2 = 19;
        int maxNumber = Max.max(number1, number2);
        System.out.println("Максимальное число: " + maxNumber);
    }
}

