package basic_codes;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) 
	{
		System.out.println("Enter your age:");
		Scanner a=new Scanner(System.in);
		int age=a.nextInt();
		System.out.println("Your age is:"+age);
		
		System.out.println("Enter your name:");
		Scanner b=new Scanner(System.in);
		String name=b.nextLine();
		System.out.println("Your name is:"+name);
	}

}
