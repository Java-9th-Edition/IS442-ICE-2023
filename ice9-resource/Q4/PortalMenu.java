import java.util.*;

public class PortalMenu {
	private PortalController pctrl;

    // constructor
	public PortalMenu(PortalController pctrl) {
		this.pctrl = pctrl;
	}

	// gets account to, account from and amount to transfer from user input and performs transfer
    public void processTransfer(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your account number > ");
		String accntNum = sc.nextLine();
		System.out.println();

		System.out.print("Enter account to transfer to > ");
		String accntTo = sc.nextLine();
		System.out.println();

		System.out.print("Enter amount to transfer > ");
		double amount = sc.nextDouble();
		System.out.println();

		if (pctrl.transfer(accntNum, accntTo, amount)) {
			System.out.println(amount + " is transferred from " + accntNum + " to " + accntTo);
		} else {
			System.out.println(accntNum + " has insufficient funds for transfer");
		}


    }        
}