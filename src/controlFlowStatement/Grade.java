package controlFlowStatement;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		
			System.out.println("Enter the marks");
			Scanner sc=new Scanner(System.in);
			int mark=sc.nextInt();
			
			if(mark>=95) {
				System.out.println("A++ Grade!");
			}
			else if(mark>=90 && mark<95) {
				System.out.println("A Grade!");
			}
			else if(mark<90) {
				System.out.println("B Grade!");
			}
	}

}
