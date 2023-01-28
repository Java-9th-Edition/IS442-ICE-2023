public class Commando extends Soldier {

    double vocationalAllowance;

    public Commando(String name, double baseAllowance, double vocationalAllowance) {
        super(name, baseAllowance);
        this.vocationalAllowance = vocationalAllowance;
    }

    public double getGrossAllowance() {
        return this.getBaseAllowance() + this.vocationalAllowance;
    }

    public String toString() {
        return "Commando{Soldier{name=" + this.getName() + ", baseAllowance=" + this.getBaseAllowance() + "}, vocationalAllowance=" + this.vocationalAllowance + "}";
    }
}
