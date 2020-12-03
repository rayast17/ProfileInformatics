package domrab;

import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private Date dateCreated = new Date();
	
	private static double yearInterestRate = 4.5;
	
	Account(){	
	}
	
	Account(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public static double getYearInterestRate() {
		return yearInterestRate;
	}

	public static void setYearInterestRate(double yearInterestRate) {
		Account.yearInterestRate = yearInterestRate;
	}
	
	public static double getMonthlyInterestRate() {
		return yearInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * yearInterestRate /12 /100;
	}
	
	public void deposit(double sum) {
		balance += sum;
	}
	public void withdraw(double draw) {
		balance -= draw;
	}
	

}
