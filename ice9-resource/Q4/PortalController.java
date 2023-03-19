// controller class containing the logic for bank transfer
public class PortalController {
	private Bank bank; // store all accounts in the bank
	// constructor

    public PortalController() {
        bank = new Bank();
    }


    // Write your answer below.

    public boolean transfer(String accntNum, String accntTo, double amount){
        Account account = bank.retrieveAccount(accntNum);
        Account accountTo = bank.retrieveAccount(accntTo);

        if (account.getBalance() - amount < 0){
            return false;
        }
        else{
            account.deduct(amount);
            accountTo.add(amount);
            return true;
        }
    }
}