package controlFlowStatement;

import java.util.Scanner;

public class SwitchCase3 {
	public static void main(String[] args) {
		/*
		 * String class provides conversion methods
		 * toUpperCase()--->upper case
		 * toLowerCase()--->lower case
		 */
		String a="MiTZi";
		System.out.println(a.toUpperCase()); // will convert lower case to upper case
		System.out.println(a.toLowerCase()); // will convert upper case to lower case
		//Browser
		System.out.println("Enter the browser name");
		Scanner sc=new Scanner(System.in);
		String br=sc.nextLine();
		
		switch (br.toLowerCase()) // will convert upper case into lower case
		{
		case "chrome":
			System.out.println("Chrome is running!");
			break;
		case "edge":
			System.out.println("Microsoft Edge is running!");
			break;
		case "firefox":
			System.out.println("Firefox is running!");
			break;
		default:
			System.out.println("Enter a valid browser name");
			break;
		}
	}

}
