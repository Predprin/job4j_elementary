package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double fullAmount = amount + amount * percent / 100;
        while (fullAmount > 0) {
            fullAmount -= salary;
            year += 1;
            fullAmount = fullAmount + fullAmount * percent / 100;
        }
        return year;
    }
}
