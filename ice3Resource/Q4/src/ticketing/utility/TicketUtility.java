package ticketing.utility;

import java.util.ArrayList;
import ticketing.entity.Ticket;

public class TicketUtility {
    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList) {

        if (ticketList == null) {
            return 0.0;
        }
        int numTickets = ticketList.size();
        double totalPrice = 0;

        if (numTickets == 0) {
            return 0.0;
        }

        for (Ticket ticket : ticketList) {
            totalPrice = totalPrice + ticket.calculatePrice();
        }

        return totalPrice / numTickets;
    }

}
