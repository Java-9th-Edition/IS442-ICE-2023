package ticketing.entity;

public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;
    
    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    public double calculatePrice(){
        // create a copy of numDaysInAdvance, otherwise each method call will change the original value.
        int numDaysInAdvance = this.numDaysInAdvance;
        double halfOriginalPrice = super.calculatePrice() / 2;
        double finalPrice = super.calculatePrice();

        while (numDaysInAdvance > 0) {
            if (finalPrice > halfOriginalPrice){
                finalPrice -= 0.5;
            }
            else {
                return halfOriginalPrice;
            }
            numDaysInAdvance--;
        }

        return finalPrice;
    }
    
}
