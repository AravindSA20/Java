package exceptionHandling;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		/*
		 * Finally is a block in java to run special code
		 * So code will run with or without exception
		 * Finally will not handle any exception 
		 */
		 
		System.out.println("Program started..!");
		try {
			System.out.println("Division is: )"+(9/0));
		}catch(ArithmeticException a)
		{
			System.out.println("Please provide valid divisible number except 0");
		}
		finally
		{
			System.out.println("Test Completed..!");
		}
		System.out.println("Program ended..!");
	}
	

}
