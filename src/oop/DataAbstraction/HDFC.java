package oop.DataAbstraction;

public class HDFC implements RBI  //using implements keyword bcoz of interface
{

	public void customerData() {
		System.out.println("HDFC....customer details()");
	}
     
	//Adding unimplemented methods by right clicking on HDFC and we can customize it from RBI for HDFC
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("HDFC....deposit()");	
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("HDFC....withdraw()");
	}

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("HDFC....rate of interest is 8%");
	}
}
