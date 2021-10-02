package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womenWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 184;
        short heightWomen = 172;
        double man = Fit.manWeight(heightMan);
        double women = Fit.womenWeight(heightWomen);
        System.out.println("Ideal weight of a man with height " + heightMan + "cm - " + man + " kg");
        System.out.println("Ideal weight of a women with height " + heightWomen + "cm - " + women + " kg");
    }
}
