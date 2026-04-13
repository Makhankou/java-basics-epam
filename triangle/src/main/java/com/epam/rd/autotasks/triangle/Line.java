package com.epam.rd.autotasks.triangle;

public class Line {
    private Line() {}

    public static double length(Point a, Point b) {
        return Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
    }
}
