public class Octagon implements Shape{
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * this.side * this.side;
    }

    public double getPerimeter() {
        return 8 * this.side;
    }

    public double getSide() {
        return this.side;
    }
    public String toString() {
        return "Octagon(side: " + this.side + ")";
    }
}
