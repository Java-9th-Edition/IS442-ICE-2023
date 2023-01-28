public class Soldier {
    private String name;
    private double baseAllowance;
    
    
    public Soldier(String name, double baseAllowance) {
        this.name = name;
        this.baseAllowance = baseAllowance;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseAllowance() {
        return baseAllowance;
    }

    public void setBaseAllowance(double baseAllowance) {
        this.baseAllowance = baseAllowance;
    }

    public double getGrossAllowance() {
        return this.baseAllowance;
    }
    
    public String toString() {
        return "Soldier{name=" + this.name + ", baseAllowance: " + this.getGrossAllowance()+"}";
    }


}
