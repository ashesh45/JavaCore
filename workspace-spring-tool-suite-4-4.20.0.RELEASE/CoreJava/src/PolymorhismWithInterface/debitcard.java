package PolymorhismWithInterface;

public class debitcard implements payment {
	@Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Debit Card");
    }

}
