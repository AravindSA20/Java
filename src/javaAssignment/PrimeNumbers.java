package javaAssignment;
public class PrimeNumbers {
// 2. Write a java program to find prime numbers between 1 to 100
	
	public static void main(String[] args)
	{
		int count;
		System.out.println("Prime Numbers between 1 to 100 :");
		
		for(int i=2;i<=100;i++)
		{
			count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.print(""+i+" ");
			}
		}
	}
}
