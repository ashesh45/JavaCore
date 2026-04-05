package BankInterface;

public class SavingsAccount implements Account {
	
	 private double balance;
	    private double interestRate = 5; // 5%

	    public SavingsAccount(double balance) {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

	    public void calculateInterest() {
	        double interest = balance * interestRate / 100;
	        balance += interest;
	        System.out.println("Interest Added: " + interest);
	    }

	    public void viewBalance() {
	        System.out.println("Savings Balance: " + balance);
	    }

	    // Unique method
	    public void showInterestRate() {
	        System.out.println("Interest Rate: " + interestRate + "%");
	    }

}
