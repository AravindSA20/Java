package oop.DataAbstraction;

public class BankTest {

	public static void main(String[] args) 
	{
		HDFC h1=new HDFC();
		h1.customerData(); //individual
		h1.deposit(); //inherited abstract
		h1.withdraw();//inherited abstract
		h1.rateOfInterest();//inherited abstract

		System.out.println("-----------------------------");
		
      //RBI r1=new RBI();	//Cannot instantiate the type RBI
		
		RBI r1=new HDFC();
		r1.deposit();
		r1.withdraw();
		r1.rateOfInterest();
		
		System.out.println("------------------------------");
		
		ICICI ic1=new ICICI();
		ic1.customerData();
		ic1.deposit();
		ic1.withdraw();
		ic1.rateOfInterest();
	
	}

}
