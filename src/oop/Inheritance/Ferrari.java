package oop.Inheritance;

public class Ferrari extends Car
{
	@Override //to update the price
	public void price()
	{
		System.out.println("Ferrari......Price is 10 crores");
	}
     public void autoGear()
     {
    	 System.out.println("Ferrari......autoGear()");
     }
}
