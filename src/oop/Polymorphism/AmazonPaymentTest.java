package oop.Polymorphism;

public class AmazonPaymentTest {

	public static void main(String[] args) {
		AmazonPayment ap=new AmazonPayment();
		ap.payment(2478);
		System.out.println("----------------------------------------------------");
		ap.payment("Google Pay", 2478);
		System.out.println("----------------------------------------------------");
		ap.payment(2478, "MI15T20ZI0896");
		System.out.println("----------------------------------------------------");
		ap.payment("ICICI Bank Credit Card", 457631, 2478);
		System.out.println("----------------------------------------------------");
		ap.payment("State Bank Debit Card", 75843845667L, 619, 2478);
	}

}
