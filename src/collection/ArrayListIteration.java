package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIteration {
	/*
	 * ArrayList is class implements List interface
	 * Under line data structure is Dynamic array
	 * Frequent operation for ArrayList is Data retrieval
	 * List is ordered collection
	 * List allowed duplication
	 * List is based on indexing
	 * Default capacity is 10 virtual segment
	 * ArrayList is non synchronized class
	 * 
	 * Methods:
	 * add(),get(index),add(index,value),remove(),isEmpty(),contains(value),clear()
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>(); //Wrapper class is used
		a1.add(20);
		a1.add(80);
		a1.add(60);
		a1.add(20);
		a1.add(100);
		System.out.println(a1);
		
		System.out.println("----Iteration using for loop---");
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i)); //to ge the values
		}
		
		System.out.println("----Iteration using for each loop----");
		
		for(Integer i:a1)  //Same object type(Integer) should be used
		{
			System.out.println(i);
		}
		
		System.out.println("----Iteration using Iterator() method----");
		
		/*
		 * iterator is a method which returns Iterator interface object
		 * hasNext()--> Confirms is list containing the element
		 * next()-->return that element and increment counter for next element in list
		 */
		
		Iterator<Integer> ir=a1.iterator();  //Importing java.util.Iterator;
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		/*
		 * Collection is interface
		 * Collections is class in java and this class contains static method
		 * sort()-Ascending order
		 */
		
		System.out.println("-------------------");
		
		System.out.println("Before sort: "+a1);
		Collections.sort(a1);
		System.out.println("After sort: "+a1); 
	}

}
