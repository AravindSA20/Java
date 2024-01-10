package exceptionHandling;

import java.util.Scanner;

public class RunTimeExceptions {

	int id=105;
	
	public static void main(String[] args) 
	{
		
		//NullPointerException
		RunTimeExceptions r1=new RunTimeExceptions();
		try{
			r1=null; //When the object is null -NullPointerException
		System.out.println("ID is :"+r1.id);
		}catch(Exception a) {
			System.out.println("Please provide a valid ID");
		}
	
		
		
	/*	//NumberFormatException
	 
		String s1="100ABC"; // 100 is an integer so valid, but 100ABC is NumberFormatException 
		try{
		int num=Integer.parseInt(s1);//NumberFormatException  
		System.out.println(num);
		}catch(NumberFormatException obj)
		{
			System.out.println("Please provide valid parseable string");
		}
	*/	
		
		
	/*  //ArrayIndexOutOfBoundsException
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index between 0 to 5");
		int index=sc.nextInt(); 
		int arr[]= {10,20,30,40,50,60};
		try {
		System.out.println(arr[index]);// index=7 -ArrayIndexOutOfBoundsException
		}catch(Exception e)  //Exception is parent class, we can use this if we dont know the type of exception
		{
			System.out.println("Please provide index value from 0 to 5 only");
		}
	*/
		
		
	/*  //ArithmeticException
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two numbers: ");
		int a=sc.nextInt(); //10
		int b=sc.nextInt(); //0 - number cant be divisible by 0
		
		System.out.println("Additon: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		//Handling exception using try-catch block
		try {
		System.out.println("Division: "+(a/b)); //ArithmeticException: / by zero
		}catch(ArithmeticException obj)
		{
			 System.out.println("Enter a number other than 0 for Division "+obj.getMessage()); //getMessage() will show the message of exception 
		}
		System.out.println("Multiplication: "+(a*b));
		
		
		sc.close(); //Previous memory will be cleared using close()
	*/
	}

}
