package domrab;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1222, 20000);
		acc.withdraw(2500);
		acc.deposit(3000);
		
		System.out.println("Balance: " + acc.getBalance() + "\nMonthly interest: " + acc.getMonthlyInterest() + "\nDate: " + acc.getDateCreated());
	}

}