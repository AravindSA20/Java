package javaAssignment;
public class StringReverse {
// 1. Write a java program to reverse a string with and without reverse() function
	
	public static void main(String[] args)
	{
		//Reverse a string with reverse() function using StringBuilder
	    StringBuilder sa=new StringBuilder("StarAgile");
		System.out.println(sa);
		System.out.println("Reverse of "+sa+" is: "+sa.reverse());
			
		System.out.println("-----------------------------");
		
		//Reverse a string without reverse() using for loop
		String s="Automation";
		String result="";
				
		for(int i=s.length()-1;i>=0;i--)
		{
			result=result+s.charAt(i);
		}
		System.out.println("Reverse of "+s+" is : "+result);	
	}
}
