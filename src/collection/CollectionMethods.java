package collection;

import java.util.ArrayList;

public class CollectionMethods {
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
		ArrayList<Integer> a1=new ArrayList<Integer>();
		 System.out.println("Before adding elements,Is List is empty: "+a1.isEmpty()); //True
		 a1.add(80);
		 a1.add(20);
		 a1.add(40);
		 a1.add(15);
		 a1.add(20); //dupicate values are allowed
		 System.out.println("After adding elements,Is List is empty: "+a1.isEmpty()); //False
		 System.out.println("Total Elements: "+a1.size()); //5
		 System.out.println(a1);
		 //Insert an element at 0th position
		 a1.add(0, 10);
		 System.out.println(a1); //Same Order is maintained
		 //Remove any element from 3rd position
		 a1.remove(2);
		 System.out.println(a1);
		 
		 a1.add(50);
		 a1.add(20);
		 a1.add(15);
		 System.out.println(a1);
		 
		 a1.add(null);
		 a1.add(null);
		 //null is unknown value
		 System.out.println(a1);
		 
		 //contains(value)- to check any value is present in that list
		 System.out.println("Check for 15? :"+a1.contains(15)); //True
		 System.out.println("Check for 1520? :"+a1.contains(1520)); //False
		 
		 //To remove all the elements
//		 a1.clear();
//		 System.out.println(a1); //[]
		 
	 }
}
