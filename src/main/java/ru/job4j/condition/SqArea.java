package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double area1 = SqArea.square(12, 2);
        double area2 = SqArea.square(6, 2);
        System.out.println("p = 4, k = 1, s = 1, real = " + area1);
        System.out.println("p = 6, k = 2, real = " + area2);
    }
}
