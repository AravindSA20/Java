package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
   /*
    * HashSet is class that implements Set interface
    * underline data structure is HashTable
    * HashTable maintains data as per hash function()
    * Initially there are 16 segments
    * Unordered collection
    * Unique elements are maintained (no duplicate)
    * Node
      |Key|hashCode|value|next element address
    */
	public static void main(String[] args)
	{
		HashSet<Integer> hs=new HashSet<Integer>(); //Importing java.util.HashSet;
        System.out.println("Is HashSet empty? :"+hs); //True
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(20);
        System.out.println("Is set empty: "+hs.isEmpty());//False
        System.out.println("Total Elements are: "+hs.size()); //4 , since duplicate values are not considered in HashSet
        System.out.println(hs);//Order will not be same
        
        hs.add(null); //For null value, hashcode and index will always be 0
        System.out.println(hs); //This prints null value in zeroth position
        
        System.out.println("Is set contains 30: "+hs.contains(30)); //true
        System.out.println("Is set contains 70: "+hs.contains(70)); //false
        
        hs.remove(null);
        System.out.println(hs); //null is removed
        
        System.out.println("----Iterate using for each loop----");
        
        //for loop- for(int i=0)
        
        for(Integer i:hs)
        {
        	System.out.println(i);
        }
        
        System.out.println("----Iterate using Iterator()----");
        
        Iterator<Integer> ir=hs.iterator(); //importing java.util.Iterator;
        while(ir.hasNext())
        {
        	System.out.println(ir.next()); 
        }
        

    	System.out.println("----For sorting----");
       
        //To sort, we must convert set to list and we can sort
    	
    	// Using Constructor, Using addAll() we can covert set to list
    	List<Integer> list1=new ArrayList<Integer>(hs);//importing java.util for List and ArrayList
        //hs is passed in constructor
    	System.out.println(list1);
    	
    	//Sort
    	Collections.sort(list1);
    	System.out.println(list1);
    	
    	// Using addAll()
    	List<Integer> list2=new ArrayList<Integer>();
    	list2.addAll(hs);
    	list2.add(100);
    	System.out.println(list2);
    	
    	/* Interview Question
    	 * How to remove duplicate from List
    	 --> By converting List into Set where duplicate values are eliminated
    	 */
    	
    	List<Integer> l1=new ArrayList<Integer>();
    	l1.add(20);
    	l1.add(30);
    	l1.add(40);
    	l1.add(50);
    	System.out.println(l1);
    	
    	System.out.println("----Quick Generation using Arrays Class----");
    	//To generate quick List you can use Arrays class
         List<Integer> l2=Arrays.asList(10,20,30,20,10,40,50);
         System.out.println(l2);
    	
         //duplicate values are removed using Set
         Set<Integer> set1=new HashSet<Integer>(l2); //passing l2 in constructor and importing java.util.Set;
         System.out.println(set1);
         
    	hs.clear();
        System.out.println(hs); //[] ,No exception but every elements are cleared
	}

}
