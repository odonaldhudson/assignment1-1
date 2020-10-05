package com.meritamerica.assignment1;

public class CheckingAccount {
	public double balance = 0;
	private static final double INTEREST_RATE = 0.0001;
	
	public CheckingAccount (double balance) {
		this.balance = balance;
			
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.INTEREST_RATE;
		
	}
	public boolean withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance = this.balance - amount;
			System.out.println("You have withdrawn "+ amount + " Your balance is" + balance);
			return true;
		}
		else {
			System.out.println("BE GONE BROKE BOY");
			return false;
		}
	}
	public boolean deposit(double amount) {
		if (amount >= 0) {
			this.balance = this.balance + amount;
			return true;
		}
		else {
			return false;
		}
		}
	public double futureValue(int years) {
		double value = 0;
			value =	balance * Math.pow(1+INTEREST_RATE, years);
		return value;
	}
	public String toString() {
		return "Checking Account Balance " + this.balance +
				"\n Checking Account Interest Rate " + INTEREST_RATE +
				"\n Checking Account Balance in 3 Years " + futureValue(3);
		
		
	}
}