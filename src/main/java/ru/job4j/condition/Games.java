package ru.job4j.condition;

public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        String solution = (allowByParent && hasMoney) ? "I can go to the cinema." : "I can't.";
        System.out.println(solution);
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(false, true);
        Games.permission(true, false);
        Games.permission(false, false);
    }
}
