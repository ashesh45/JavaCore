package PolymorhismWithInterface;

public class upi implements payment {
	@Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

}
