package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер short массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер String массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер float массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Sergey Sergeev";
        names[3] = "Aleksandr Aleksandrov";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
