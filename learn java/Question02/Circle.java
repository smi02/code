package Question02;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;

    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;

    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

}