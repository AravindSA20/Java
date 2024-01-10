package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	/*
	 * LinkedHashSet implements Set Interface
	 * Underline data structure is doubly linked set
	 * I has features of List(It is ordered collection) and Set(It maintains unique elements)
	 * It is child class for HashSet
	 */
	
	public static void main(String[] args)
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>(); //Importing java.util.LinkedHashSet;
		ls.add(10);
		ls.add(30);
		ls.add(30);
		ls.add(40);
		ls.add(20);
		ls.add(40);
		
		System.out.println("Is LinkedHashSet empty?: "+ls.isEmpty()); //False
		System.out.println("Total Elements: "+ls.size()); //3 since duplicates are not allowed
		System.out.println(ls); // order is also maintained but not sorted
		
		ls.remove(30);
		System.out.println(ls);//30 is removed
	}

}
