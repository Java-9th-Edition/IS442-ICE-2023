package ticketing.entity;

public class Ticket {
    private String title;

    public Ticket(String title) {
        this.title = title;
    }

    public double calculatePrice() {
        double total = 0.0;
        String titleInCaps = this.title.toUpperCase();

        for(int i = 0; i < titleInCaps.length(); ++i) {
            total += (double)titleInCaps.charAt(i);
        }

        return total % 200.0 * 0.09;
    }
}
