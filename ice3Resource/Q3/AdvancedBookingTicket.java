import java.util.*;
public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }
    
    public double calculatePrice(){
        double initialPrice = super.calculatePrice();
        double finalPrice = super.calculatePrice();

        while (this.numDaysInAdvance > 0 && finalPrice > initialPrice / 2) {
            finalPrice = finalPrice - 0.5;
            this.numDaysInAdvance--;
        }

        return finalPrice;
    }
}
