public class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return this.length;
    }

    public double getBreadth() {
        return this.breadth;
    }

    public double getArea() {
        return this.length * this.breadth;
    }

    public double getPerimeter() {
        return 2.0 * (this.length + this.breadth);
    }

    public String toString() {
        return "Rectangle[length=" + this.length + ",breadth=" + this.breadth + "]";
    }
}
