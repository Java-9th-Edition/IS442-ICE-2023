public class Vehicle {
    private int numWheels;
    private double distancePerLitre;

    public Vehicle(int numWheels, double distancePerLitre) {
        this.numWheels = numWheels;
        this.distancePerLitre = distancePerLitre;
    }

    public String toString() {
        return "Vehicle[numWheels=" + this.numWheels + ", distancePerLitre=" + this.distancePerLitre + "]";
    }
}
