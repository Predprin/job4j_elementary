package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return dif(first, second) + div(first, second);
    }

    public static double fullAmount(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + dif(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и произведения: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета разности и деления: " + difAndDiv(10, 20));
        System.out.println("Сумма вычислений всех операций равна: " + fullAmount(10, 20));
    }
}
