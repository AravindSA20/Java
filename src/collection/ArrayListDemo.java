package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	/*
	 * ArrayList is class implements List interface
	 * Under line data structure is Dynamic array
	 * 
	 * List is ordered collection
	 * List allowed duplication
	 * 
	 * Default capacity is 10 virtual segment
	 */

	public static void main(String[] args)
	{
		//List with Interface
		/*
		//Cannot instantiate the type List<Integer>, hence we are using parent reference and child object
		List<Integer> l1=new List<Integer>(); //Importing java.util.List
		*/
	//	List<Integer> l1=new ArrayList<Integer>(); //Importing java.util.List
		//List- Parent reference, ArrayList- Child object
		
		   
		//Generic Way - Type safe and No type  casting required
		ArrayList<Integer> a1=new ArrayList<Integer>(); //Wrapper class is used
		a1.add(10);
		a1.add(40);
		a1.add(70);
		a1.add(30);
		System.out.println(a1);
		
		int num=a1.get(0); //notype casting required 
		System.out.println(num); //10
		
		System.out.println("--------------------------------");
		
		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Thanjavur");
		loc.add("Chennai");
		loc.add("Bangalore");
		System.out.println(loc);
		/*
		//Non Generic way- 1.It is not type safe  2.It needs type casting
		//Hence we don't follow this way
		ArrayList a1=new ArrayList();   //Importing java.util.ArrayList;
		a1.add(100);
		a1.add('S');
		a1.add("Sanju");
		a1.add(15.20);
		System.out.println(a1);
		//- ArrayList is a raw type.
		//- References to generic type ArrayList<E> should be parameterized
		int num=(int)a1.get(0); //Type casting required
		System.out.println(num);
		*/
	}

}
