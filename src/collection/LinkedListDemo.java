package collection;

import java.util.LinkedList;

public class LinkedListDemo {
     /*
      * LinkedList is class that implements List interface
      * Underline data structure by doubly LinkedList
      * LinkedList is non synchronized
      * Frequent operation is data insertion and deletion
    
      * Few more methods available in LinkedList:
        addFirst(), addLast(), getFirst(), getLast() 
      */
	
	public static void main(String[] args) 
	{
	    LinkedList<Integer> a1=new LinkedList<Integer>(); //Importing java,util.LinkedList;
	    System.out.println("Is Linkedlist empty: "+a1.isEmpty());//True
	    a1.add(10);
		a1.add(40);
		a1.add(70);
		a1.add(30);
		System.out.println(a1);

		System.out.println("Total Elements: "+a1.size());
		
		System.out.println(a1.contains(100));//false
		System.out.println(a1.contains(40));//true
		
		a1.addFirst(20);
		a1.addLast(80);
		System.out.println(a1.getFirst()); //20
		System.out.println(a1.getLast()); //80
		
		System.out.println(a1); 
		
		a1.remove(3); //Fourth value will be removed
		System.out.println(a1);
		
		System.out.println("----Iteration using for each----");
		
		for(Integer i:a1)
		{
			System.out.println(i);
		}
	}
}
