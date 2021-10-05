package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        String solution = (hasMoney || beFriend) ? "I can go to the club." : "I can't.";
        System.out.println(solution);
    }

    public static void main(String[] args) {
        permission(false, false);
        permission(true, false);
        permission(false, true);
        permission(true, true);
    }
}
