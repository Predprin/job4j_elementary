package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double interval1 = Point.distance(10, 5, 21, 19);
        System.out.println("Distance (10, 5) to (21, 19) = " + interval1);
        double interval2 = Point.distance(0, 0, 2, 0);
        System.out.println("Distance (0, 0) to (2, 0) = " + interval2);
        double interval3 = Point.distance(-10, 0, 20, 10);
        System.out.println("Distance (-10, 0) to (20, 10) = " + interval3);
        double interval4 = Point.distance(500, 345, 250, -420);
        System.out.println("Distance (500, 345) to (250, -420) = " + interval4);
    }

}
