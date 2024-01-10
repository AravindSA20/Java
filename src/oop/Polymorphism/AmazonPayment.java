package oop.Polymorphism;

public class AmazonPayment {
	public void payment(int cash)
	{
		System.out.println("Amount to be paid during Cash On Deleviry(COD): Rs."+cash);
	}
	public void payment(String upi,int price)
	{
		System.out.println("Select the platform for UPI transaction: "+upi+"\nAmount to be paid: Rs."+price);
	}
	public void payment(int amazonpay,String voucher)
	{
		System.out.println("Amount to be paid using AmzonPay: Rs."+amazonpay+"\nEnter the promo code to avail offer: "+voucher);
	}
	public void payment(String ccard,int otp,int price)
	{
		System.out.println("Select the Credi card: "+ccard+"\nEnter the OTP for securement: "+otp+"\nAmount to be paid: Rs."+price);
	}
	public void payment(String dcard,long cardnum,int cvv,int price)
	{
		System.out.println("Select the Debit card: "+dcard+"\nEnter the Card number: "+cardnum+" Enter CVV: "+cvv+"\nAmount to be paid: Rs."+price);
	}
}
