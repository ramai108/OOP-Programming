package Inheritance.exercises;

public class Point {

    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public boolean equals (Object o) {
        if (o == null) return false;
        return true;
    }

    public static void main(String[] args) {

        Point p1 = new Point(10,20);
        Point p2 = new Point(10,20);
        Point p3 = new Point(20,30);
        Object o = new Object();

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(o));
        System.out.println(p2.equals(p3));

    }

}
