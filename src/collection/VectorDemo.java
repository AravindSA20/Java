package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	/*
	 * vector is a class that implements List interface
	 * Underline data structure is Dynamic array
	 * Vector is synchronized
	 * Performance wise vector is slow, so we don't follow in real time
	 */
	
	public static void main(String[] args)
	{
		Vector<Integer> v1=new Vector<Integer>(); //Import java.util.Vector;
		System.out.println("Is List is Empty? :"+v1.isEmpty()); //True
		 if(v1.isEmpty())
		 {
			    v1.add(30);
				v1.add(40);
				v1.add(10);
				v1.add(20);
		 }
		 System.out.println(v1);
		 System.out.println("Total Elements are: "+v1.size());
		 
		 v1.remove(0);
		 System.out.println("Removed Oth positon"+v1);
		 
		 v1.add(0, 100);
		 System.out.println("Added value to )th position"+v1);
		 
		 System.out.println("Does List has 70? :"+v1.contains(70)); //False
		 System.out.println("Does List has 100? :"+v1.contains(100)); //True
		 
		 System.out.println("----Iteration using for each loop----");
			
			for(Integer i:v1)  //Same object type(Integer) should be used
			{
				System.out.println(i);
			}
			
			System.out.println("----Iteration using Iterator() method----");
			
			Iterator<Integer> ir=v1.iterator();  //Importing java.util.Iterator;
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
	}

}
