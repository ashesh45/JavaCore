package PolymorhismWithInterface;

public class creditcard implements payment {
	 @Override
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + " using Credit Card");
	    }

}
