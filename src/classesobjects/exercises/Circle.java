package classesobjects.exercises;

public class Circle {

    private final double greekpi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * (greekpi * radius);
    }

    public double getArea() {
        return greekpi * (Math.pow(radius, 2));
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(31);
        Circle c2 = new Circle(31);

        System.out.println(c1.getCircumference());
        System.out.println(c2.getArea());
    }

}
