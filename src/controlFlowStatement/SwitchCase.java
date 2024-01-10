package controlFlowStatement;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("Enter a number from 0 to 5");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//break means control will come outside the switch body, break is mandatory in switch case
		//break cannot be applied outside of a loop or switch
		switch (num) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;	
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Six");
			break;	
		default:
			System.out.println("Please provide appropriate number");
			break;
		}
	}

}
