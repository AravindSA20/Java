package oop.DataAbstraction;

public class ICICI implements RBI{
    public void customerData()
    {
    	System.out.println("ICICI....customerData()");
    }
    
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("ICICI....deposit()");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("ICICI....withdraw()");
	}

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("ICICI....rate of interest is 10%");
	}

}
