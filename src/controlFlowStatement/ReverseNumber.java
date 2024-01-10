package controlFlowStatement;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rem;
		int rev=0;
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//To understand logic watch java-6 video
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
		}
		System.out.println("The Reverse number is: "+rev);

	}

}
