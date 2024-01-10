package controlFlowStatement;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		System.out.println("Enter value of A: ");
		Scanner q=new Scanner(System.in);
		int a=q.nextInt();
		System.out.println(a);
		
		System.out.println("Enter value of B: ");
		Scanner w=new Scanner(System.in);
		int b=w.nextInt();
		System.out.println(b);
		
		if(a>b) {
			System.out.println(a+"(A)is greater than (B)"+b);
		}
		else {
			System.out.println(b+"(B) is greater than (A)"+a);
		}
	
	/*
    	// Odd or Even number
		System.out.println("Enter the Number:");
		Scanner n=new Scanner(System.in);
		int num=n.nextInt();
		System.out.println(num);
		
		if((num%2)==0) {
			System.out.println("Entered number is an Even number");
		}
		else {
			System.out.println("Entered number is an Odd number");
		}
	    
		
		
		// Positive or Negative number
		System.out.println("Enter the Number:");
		Scanner no=new Scanner(System.in);
		int numb=no.nextInt();
		System.out.println(numb);
		
		if(numb>0) {
			System.out.println("Entered number is Positive number");
		}
		else
		{
			System.out.println("Entered number is negative number");
		}	
		*/
	}
}
