package BankInterface;

public class CurrentAccount implements Account {
	
    private double balance;
    private double overdraftLimit = 1000;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }

}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("No interest for current account");
	}

	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Current Balance: " +balance );
	}
	
	 // Unique method
    public void showOverdraftLimit() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
