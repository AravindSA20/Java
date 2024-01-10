package basic_codes;

import java.io.IOException;
import java.util.Scanner;

public class InpuFromUser {
	public static void main(String[] args) throws IOException 
	{
     	/*
		// Technique 1: read() reads single character and returns int data(ASCII)
		   We don't follow this technique
		System.out.println("Enter your Age:"); //26
		int age=System.in.read(); // read() will take first value '2' as char 
		System.out.println("Your age is:"+age); // ASCII value of 2 is 50 which is printed
		
		// Technique 2: BufferedReader class
		   We don't follow this technique because its a lengthy process
		System.out.println("Enter your Age");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		int age=Integer.parseInt(data);
		System.out.println("Your Age is:"+age);
		*/
		
		// Technique 3: Scanner Class - generally we use this technique
		  
		System.out.println("Enter your Age: ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		System.out.println("Your Age is: "+age);
	}

}
