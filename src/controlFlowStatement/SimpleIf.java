package controlFlowStatement;

import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
		// Accept Age from the user and compare voting is valid
		
		System.out.println("Enter your Age: ");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		System.out.println("Your Age is: "+age);
		
		if(age>=18) {
			System.out.println("User is eligible for voting");
		}
	}

}
