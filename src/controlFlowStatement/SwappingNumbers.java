package controlFlowStatement;

import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the numbers to swap:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Numbers before Swapping :"+a+" & "+b);
	/*	//Extra variable
		int temp;  //using temporary(empty) variable for storing
		temp=a; 
		a=b;
		b=temp;
	*/
		//Without extra variable     - a=20, b=15
		a=a+b; //a=a+b=30
		b=a-b; //b=30-10=20 , b=20
		a=a-b; //a=20-10=10 , a=10
	    System.out.println("Numbers after Swapping :"+a+" & "+b);
		
	}

}
