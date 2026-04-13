package com.epam.rd.autotasks.segments;

class Segment {
    private Point start;
    private Point end;
    private double x1, x2, y1, y2;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.x1 = start.getX();
        this.x2 = end.getX();
        this.y1 = start.getY();
        this.y2 = end.getY();

        // if start and end are the same point — throw error
        if (x1 == x2 && y1 == y2) {
            throw new IllegalArgumentException();
        }
    }

    double length() {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    Point middle() {
        return new Point((x1 + x2) / 2, (y1 + y2) / 2);
    }

    Point intersection(Segment another) {
        double x3 = another.start.getX();
        double x4 = another.end.getX();
        double y3 = another.start.getY();
        double y4 = another.end.getY();

        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        // segments are parallel or collinear — no intersection
        if (denominator == 0) {
            return null;
        }

        double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / denominator;
        double u = ((x1 - x3) * (y1 - y2) - (y1 - y3) * (x1 - x2)) / denominator;

        // intersection point must lie ON BOTH segments
        if (t >= 0 && t <= 1 && u >= 0 && u <= 1) {
            return new Point(
                    x1 + t * (x2 - x1),
                    y1 + t * (y2 - y1)
            );
        }

        return null;
    }
}
