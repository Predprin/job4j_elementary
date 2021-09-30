package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int rubles1 = 190;
        int rubles2 = 600;
        float euro = Converter.rubleToEuro(rubles1);
        float dollar = Converter.rubleToDollar(rubles2);
        System.out.println(rubles1 + " rubles are " + euro + " euro.");
        System.out.println(rubles2 + " rubles are " + dollar + " dollar.");
    }
}
