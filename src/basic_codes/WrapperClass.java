package basic_codes;

public class WrapperClass {
	public static void main(String[] args) {
	
	/*
	 *  To store primitive data in the form of object(Collection framework)
	 *  and To convert object into primitive data type, we use wrapper class
	 *  Wrapperclass and its parseDatatype()
	 * If data is not in convertible form, you will get exception from that method, 
	   ie., NumberFormat Exception
	 */
	
	String s1="300"; 
	System.out.println(s1+100); // 300100
	
	// String to int --> Integer wrapper class
	int num=Integer.parseInt(s1);
	System.out.println(num+100); // 300+100=400
	
	String s2="22.49";
	System.out.println(s2+11.52); // 22.4911.52
	
	// String to double --> Double wrapper class
	double num1=Double.parseDouble(s2);
	System.out.println(num1+11.52); // 22.49+11.52=34.01
	
	String s3="False";
	boolean f=Boolean.parseBoolean(s3);
	System.out.println(f);
	
	/*
	 * String is class in Java
	 * String is collection of characters
	 * String class have inbuilt methods
	 * For specific character from String, use charAt(index)
	 */
	
	String s4="R";
	char c=s4.charAt(0);   // 0 is index
	System.out.println(c);
	
	String s5="Sanjana";
	char c1=s5.charAt(6);
	System.out.println(c1); // a(6 as index) will be printed
	
	System.out.println("--------------------------------------");
	
	// Primitive to Object (String-->valueOf())
	
	int x=300;
	System.out.println(x+200); // 300+200=500
	
	//int into String
	String q1=String.valueOf(x);
	System.out.println(q1+200); // 300200
	
	float f2=34.26f; // suffix can be f or F
	System.out.println(f2+11.22f);  //34.26+11.22=45.48
	
	//float into string
	String w=String.valueOf(f2);
	System.out.println(w+11.22f); //34.2611.22
	
	
	}

}
