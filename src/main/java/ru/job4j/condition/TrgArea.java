package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double area1 = TrgArea.area(2, 2, 2);
        double area2 = TrgArea.area(10, 25, 30);
        System.out.println("Area triangle (2, 2, 2) = " + area1);
        System.out.println("Area triangle (10, 25, 30) = " + area2);
    }

}
