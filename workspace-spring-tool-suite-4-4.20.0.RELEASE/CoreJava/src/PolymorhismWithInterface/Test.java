package PolymorhismWithInterface;

public class Test {
	
	public static void main(String[] args) {
        // Interface reference
        payment payment;

        // CreditCard payment
        payment = new creditcard();
        payment.pay(5000);

        // DebitCard payment
        payment = new debitcard();
        payment.pay(2500);

        // UPI payment
        payment = new upi();
        payment.pay(1200);
    }

}
