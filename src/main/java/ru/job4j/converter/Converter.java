package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int rubles1 = 140;
        int rubles2 = 600;
        float expectedEuro = 2;
        float expectedDollar = 10;
        float outEuro = Converter.rubleToEuro(rubles1);
        float outDollar = Converter.rubleToDollar(rubles2);
        float euro = Converter.rubleToEuro(rubles1);
        float dollar = Converter.rubleToDollar(rubles2);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(rubles1 + " rubles are " + euro + " euro.");
        System.out.println(rubles2 + " rubles are " + dollar + " dollar.");
        System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);
        System.out.println("600 rubles are 10 Dollars. Test result : " + passedDollar);
    }
}
