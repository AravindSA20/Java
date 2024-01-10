package oop.Inheritance;

//final class Demo 
class Demo
{
	final int x=100;
	//public void final color()
	public void color()
	{
		System.out.println("Color is Pink");
	}
}

//This type FinalKeyword cannot subclass the final class Demo
public class FinalKeyword extends Demo
{
//	@Override
//	public void color() //The method color() of type FinalKeyword must override or implement a supertype method
//	{
//		System.out.println("Color is Blue");
//	}
     public static void main(String[] args) {
		FinalKeyword f1=new FinalKeyword();
		System.out.println(f1.x); //100
   	//f1.x=500; //The final field Demo.x cannot be assigned
	//f1.color(); //The method color() is undefined for the type FinalKeyword
		f1.color(); 
		System.out.println(f1.x); //100 -updated value is still 100 because of final keyword
    	 
    	 
	}
}
