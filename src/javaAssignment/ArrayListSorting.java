package javaAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
// 4. Write a java program to sort the ArrayList in ascending order
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> sa=new ArrayList<Integer>(); 
		sa.add(100);
		sa.add(70);
		sa.add(10);
		sa.add(20);
		sa.add(50);
		sa.add(40);
		
		System.out.println("Before sort: "+sa);
		Collections.sort(sa);
		System.out.println("After sorting in Ascending Order: "+sa); 
	}
}
