package BankInterface;

public class Test {
	
	   public static void main(String[] args) {

	        Bank bank = new Bank();

	        SavingsAccount sa = new SavingsAccount(5000);
	        CurrentAccount ca = new CurrentAccount(3000);

	        bank.addAccount(sa);
	        bank.addAccount(ca);

	        // Operations
	        sa.deposit(1000);
	        sa.calculateInterest();
	        sa.viewBalance();
	        sa.showInterestRate();

	        System.out.println("------------------");

	        ca.withdraw(3500);
	        ca.viewBalance();
	        ca.showOverdraftLimit();

	        System.out.println("------------------");

	        bank.showAllAccounts();
	    }

}
