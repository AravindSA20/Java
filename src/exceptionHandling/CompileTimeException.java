package exceptionHandling;

import java.io.IOException;

public class CompileTimeException 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.out.println("Program Started!......");
		
		Thread.sleep(4000); //InterruptedException -Add throws declaration
		
		System.out.println("Program Ends!......");
		
		System.in.read(); //IOException -Add throws declaration
	}
}
