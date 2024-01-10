package controlFlowStatement;

import java.util.Scanner;

public class NestedIf_Browser {

	public static void main(String[] args) {
		
		/*
		 * String is a class in java. To perfor operation on string, we dont use operator
		 * In sting class, we have ready-made methods
		 * For Testing equality between two strings
		   1. equals() : Exactly match the string but it is case sensitive
		   2. equalsIgnoreCase() : Exactly match the string but it is not case sensitive
		   
		 String actual="Hello All";
		 String expected="hello All";
		 System.out.println(actual.equals(expected)); //false because "Hello All" is not same as "hello All"
		 System.out.println(actual.equalsignoreCase(expected)); //true
		 
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String browser=sc.nextLine();
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test is executing on Chrome!");
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Test is executing on Firefox!");
		}
		else if(browser.equalsIgnoreCase("Opera")){
			System.out.println("Test is executing on Opera!");
		}
		else {
			System.out.println("Enter a valid browser name");
		}
	}

}
