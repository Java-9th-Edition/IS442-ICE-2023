public class CashRegister {
    private float purchase = 0;
    private float payment = 0;

    void registerPurchase(double amount) {
        this.purchase += amount;
    }

    void makePayment(int dollars, int cents) {
        this.payment = dollars + (cents / 100);
    }

    double getPurchaseAmt() {
        return this.purchase;
    }

    double giveChange() {
        return this.payment - this.purchase;
    }
    
}
