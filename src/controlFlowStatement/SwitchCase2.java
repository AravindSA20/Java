package controlFlowStatement;

import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[] args) {
		//Vowel
		System.out.println("Enter a letter");
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		char letter=ch.charAt(0);
		
		switch(letter) {
		case 'a':
			System.out.println(letter+" is a vowel");
			break;
		case 'e':
			System.out.println(letter+" is a vowel");
			break;
		case 'i':
			System.out.println(letter+" is a vowel");
			break;
		case 'o':
			System.out.println(letter+" is a vowel");
			break;
		case 'u':
			System.out.println(letter+" is a vowel");
			break;
		default:
			System.out.println(letter+" is not a vowel");
		// we can add or neglect break; only in default(not mandatory
		}
	}

}
