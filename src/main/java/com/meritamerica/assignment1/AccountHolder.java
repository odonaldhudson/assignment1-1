package com.meritamerica.assignment1;

public class AccountHolder {
	private String firstName = "";
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	private String middleName = "";
	private String lastName = "";
	private String SSN = "";
	
	CheckingAccount checkingAccount = null;
	SavingsAccount savingsAccount = null;
	
	public AccountHolder(String firstName, String middleName, String lastName, String SSN, double CheckingAccount, double SavingsAccount) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.SSN = SSN;
		this.checkingAccount = new CheckingAccount(CheckingAccount);
		this.savingsAccount = new SavingsAccount(SavingsAccount);
		
	}
	public String toString() {
		return "Name " + firstName + " " + middleName + " " + lastName + 
				"\n SSN " + SSN + 
				"\n Checking Account Balance " + checkingAccount.getBalance() + 
				"\n Checking Account Interest Rate " + checkingAccount.getInterestRate() +
				"\n Checking Account Balance In 3 Years " + checkingAccount.futureValue(3) +
				"\n Savings Account Balance " + savingsAccount.getBalance() + 
				"\n Savings Account Interest Rate " + savingsAccount.getInterestRate() +
				"\n Savings Account Balance In 3 Years " + savingsAccount.futureValue(3);
		
		
	}
}