package BankInterface;

import java.util.ArrayList;

public class Bank {
	
	 private ArrayList<Account> accounts = new ArrayList<>();

	    public void addAccount(Account acc) {
	        accounts.add(acc);
	    }

	    public void showAllAccounts() {
	        for (Account acc : accounts) {
	            acc.viewBalance();
	        }
	    }

}
