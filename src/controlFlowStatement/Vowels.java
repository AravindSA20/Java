package controlFlowStatement;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		System.out.println("Enter a letter:");
		Scanner sc=new Scanner(System.in);
		char letter=sc.nextLine().charAt(0);
		
		if(letter=='a') {
			System.out.println(letter+" is a vowel");
		}
		else if(letter=='e') {
			System.out.println(letter+" is a vowel");
		}
		else if(letter=='i') {
			System.out.println(letter+" is a vowel");
		}
		else if(letter=='o') {
			System.out.println(letter+" is a vowel");
		}
		else if(letter=='u') {
			System.out.println(letter+" is a vowel");
		}
		else {
			System.out.println(letter+" is not a vowel");
		}
	}

}
