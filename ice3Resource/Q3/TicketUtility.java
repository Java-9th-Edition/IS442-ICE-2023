import java.util.ArrayList;

public class TicketUtility {

    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList){

        if (ticketList == null) {
            return 0.0;
        }
        int numTickets = ticketList.size();
        
        if (numTickets == 0){
            return 0.0;
        }

        double totalPrice = 0;

        for(Ticket ticket: ticketList) {
            totalPrice += ticket.calculatePrice();
        }

        return totalPrice / numTickets;
    }
    
}
