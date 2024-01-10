package collection;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
     /*
      * TreeSet is class implements Set Interface
      * Underline data structure is Search Tree
      * TreeSet implements Sorted Set who extends Set interface
      * Ascending order
      */
	
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();//Importing java.util.TreeSet;
		ts.add(10);
		ts.add(30);
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(40);
		
		System.out.println("Is TreeSet empty? :"+ts.isEmpty());//false
		System.out.println("Total Elements are: "+ts.size()); //Duplicate values are eliminated
		System.out.println(ts); //Sorted manner will be printed
		System.out.println(ts.descendingSet()); //descending order
		
		//Quickly using Arrays.asList()
		List<Integer> l1=Arrays.asList(10,20,30,40,50); //Importing java.util.List;
		System.out.println(l1);
		TreeSet<Integer> ts2=new TreeSet<Integer>(l1);
		System.out.println(ts2.descendingSet());
	}

}
