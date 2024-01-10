package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
    /*
     * HashMap is class that implements Map interface
     * Underline data structure is HashTable
     * 
     * HashMap maintains data in <key=value>
     */
	public static void main(String[] args) 
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>(); //importing java.util.HashMap;
		hm.put("Dilli", 15201);
		hm.put("Vikram", 15202);
		hm.put("Rolex", 15203);
		hm.put("Leo Das", 15204);
		hm.put("Harold Das", 15204);
		
		System.out.println(hm); //Will not be inorder
		System.out.println(hm.size()); //5
		System.out.println(hm.isEmpty());//false
		
	    System.out.println("Search Key: "+hm.containsKey("Leo Das")); //True, but if half the key("Leo") entered will result in false
	    System.out.println("Search Value: "+hm.containsValue(15202));
		
	    System.out.println(hm.get("Rolex")); //15203 ,which is value of Rolex
	    
	    System.out.println(hm.remove("Leo Das"));
	    
	    System.out.println("-------Iterate Map using for each loop-----");
	    
	    //Entry is an interface in Java under Map
	    //entrySet()--> Return Type is Set<Entry<String,Integer>>
	    for(Entry<String,Integer> i:hm.entrySet())
	    {
	    	//System.out.println(i);
	    	System.out.println(i.getKey()+" : "+i.getValue());
	    }
	    
	    System.out.println("-------Iterate Map using Iterator-----");
	    
	    /*
	     * iterator() is available in collection
	     * If you want to use iterator() for map, then use entrySet()-->map into set
	     */
	    
	    Set<Entry<String,Integer>> set1=hm.entrySet(); //importing java.util.Set;
	    Iterator<Entry<String,Integer>> ir=set1.iterator(); //Importing java.util.Iterator;
	    while(ir.hasNext())
	    {
	    	System.out.println(ir.next());
	    }
	}
}
