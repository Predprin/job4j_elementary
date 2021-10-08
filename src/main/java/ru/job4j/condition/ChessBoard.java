package ru.job4j.condition;

public class ChessBoard {
    public static boolean isPositive(int x1, int y1, int x2, int y2) {
        return x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0;
    }

    public static boolean lessSeven(int x1, int y1, int x2, int y2) {
        return x1 <= 7 && y1 <= 7 && x2 <= 7 && y2 <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isPositive(x1, y1, x2, y2) && lessSeven(x1, y1, x2, y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(7, 0, 0, 7));
        System.out.println(way(8, 4, 2, 3));
        System.out.println(way(2, -1, 4, 1));
        System.out.println(way(2, 6, 4, 4));
    }
}
