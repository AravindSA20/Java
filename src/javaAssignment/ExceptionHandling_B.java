package javaAssignment;

public class ExceptionHandling_B {
// 3. Write a java program to given uncheck exception

// b. NullPointerException after handling using try-catch method
	
	int pinNo=2856;
	public static void main(String[] args) {
		ExceptionHandling_B sa=new ExceptionHandling_B();
		try{
			sa=null; //When the object is null -NullPointerException
		    System.out.println("PIN number is :"+sa.pinNo);
		}catch(Exception a) {
			System.out.println("Please provide a valid PIN number");
		}
	}
}
