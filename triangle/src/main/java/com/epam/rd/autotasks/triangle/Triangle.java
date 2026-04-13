package com.epam.rd.autotasks.triangle;


class Triangle {

    private final Point a, b, c;
    private final double side1, side2, side3;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        side1 = Line.length(a, b);
        side2 = Line.length(a, c);
        side3 = Line.length(b, c);
        if(side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2){
            throw new IllegalArgumentException();
        }
        if(a == null || b == null || c == null){
            throw new IllegalArgumentException();
        }
    }


    public double area() {
        return 1.0 / 4.0 * Math.sqrt((side1 + side2 + side3) * (-side1 + side2 + side3) * (side1 - side2 + side3) * (side1 + side2 - side3));
    }

    public Point centroid(){
        double centroidX = 1.0 / 3.0 * (a.getX() + b.getX() + c.getX());
        double centroidY = 1.0 / 3.0 * (a.getY() + b.getY() + c.getY());
        return new Point(centroidX, centroidY);
    }

}
