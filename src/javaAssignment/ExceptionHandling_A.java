package javaAssignment;
import java.util.Scanner;

public class ExceptionHandling_A {
// 3. Write a java program to given uncheck exception

// a. ArrayIndexOutOfBoundsException after handling using try-catch
	public static void main(String[] args)
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter index value between 0 to 5 :");
		int index=sa.nextInt(); 
		int arr[]= {10,20,30,40,50,60};
		try {
		System.out.println(arr[index]);// Entering index value as 20 -ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide a valid index value from 0 to 5 only");
		}
		sa.close();
	}
}
