public class Octagon implements Shape{
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public double getArea() {
        return this.side * this.side * (2.0 + 2.0 * Math.sqrt(2.0));
    }

    public double getPerimeter() {
        return 8.0 * this.side;
    }

    public String toString() {
        return "Octagon[side=" + this.side + "]";
    }

    public static void main(String[] args) {
        System.out.println((new Octagon(12.0)).getArea());
        System.out.println((new Octagon(12.0)).getPerimeter());
    }
}
