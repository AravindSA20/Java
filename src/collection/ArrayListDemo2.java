package collection;

import java.util.ArrayList;

public class ArrayListDemo2 {
	/*
	 * ArrayList is class implements List interface
	 * Under line data structure is Dynamic array
	 * Frequent operation for ArrayList is Data retrieval
	 * List is ordered collection
	 * List allowed duplication
	 * 
	 * Default capacity is 10 virtual segment
	 * ArrayList is non synchronized class
	 * 
	 * Methods:
	 * add(),get(index),add(index,value),remove(),isEmpty(),contains(value),clear()
	 */
     
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>(); //Wrapper class is used
		a1.add(10);
		a1.add(40);
		a1.add(70);
		a1.add(30);
		System.out.println(a1);
		System.out.println(a1.get(0)); //10
		System.out.println("Total Elements: "+a1.size());
		
		System.out.println("----Iteration using for each loop----");
		for(Integer i:a1) //Same object type(Integer) should be used
		{
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		ArrayList<Double> a2=new ArrayList<Double>(); //Wrapper class is used
		a2.add(10.20);
		a2.add(40.75);
		a2.add(70.50);
		a2.add(30.25);
		System.out.println(a2);
		System.out.println("Total Elements: "+a2.size());
		
		System.out.println("----Iteration using for each loop----");
		for(Double i:a2) //Same object type(Double) should be used
		{
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("Sanju");
		a3.add("Susi");
		a3.add("Senthil");
		System.out.println(a3);
		System.out.println("Total Elements: "+a3.size());
		
		System.out.println("----Iteration using for each loop----");
		for(String i:a3) //Same object type(String) should be used
		{
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add('S');
		obj.add(1996);
		obj.add("Susila");
		obj.add(15.20);
		obj.add(9894889140L);
		System.out.println(obj);
		System.out.println("Total Elements: "+obj.size());
		
		Object num=obj.get(2);
		System.out.println(num); //Susila
		
		System.out.println("----Iteration using for each loop----");
		for(Object i:obj) //Same object type(Object) should be used
		{
			System.out.println(i);
		}
		
	}

}
