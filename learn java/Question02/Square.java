package Question02;

public class Square extends Rectangle {
private double side;

    public Square() {
    }

    public Square(double side, String colour, boolean filled) {
        super(side, side);
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public String toString() {
        return "Square{" + getSide() + '}';
    }
}