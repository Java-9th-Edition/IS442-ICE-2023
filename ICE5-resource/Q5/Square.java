public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return 2.0 * this.side;
    }

    public String toString() {
        return "Square[side=" + this.side + "]";
    }
}
