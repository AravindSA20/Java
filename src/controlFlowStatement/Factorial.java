package controlFlowStatement;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=1;
		int f=1;
		while(i<=a) {
			f=f*i;
			i++;
		}
		System.out.println("Factorial of the number is: "+f);
	}

}
