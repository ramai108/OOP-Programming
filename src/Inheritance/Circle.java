package Inheritance;

public class Circle extends Shape {
    private double radius;
    private double circumference;

    public Circle(double radius, double circumference) {
        this.radius = radius;
        this.circumference = circumference;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }
}
