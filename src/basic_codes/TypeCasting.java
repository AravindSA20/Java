package basic_codes;

public class TypeCasting {
	public static void main(String args[]) {
	/*
	 * Primitive to Primitive
	   1. Implicit
	   2. Explicit
	 */
		
//  1. Implicit Casting (Converting small data into larger data)
	  // byte-->char-->short-->int-->long-->float-->double
		int x=89;
		long k=x;
		System.out.println("int to long conversion: "+k);
		
		char c1='S'; //2 byte
		int y=c1;    //4 byte
		System.out.println("char to int conversion: "+y);
		
		int a=7898; //4 byte
		float f1=a; //4 byte
		System.out.println("int to float conversion: "+f1);
		
		long l2=6778857889L; // 8 byte
		float f2=l2;         // 2 byte
		System.out.println("long to float conversion: "+f2);
	   
//  2. Explicit - Manual casting (Converting large data to small data)
	  //double-->float-->long-->int-->short--> char-->byte
	  // We can use casting operator
		
		double d1 =894665.3456; // 8 byte
		float f3=(float)d1; // 2 byte using cast operator
		System.out.println("double to float conversion: "+f3);
		
		int b=(int)d1; // 4 byte using cast operator
		System.out.println("double to int conversion: "+b);
		
		int e=87; //4 byte
		char c5=(char)e;  //2 byte using cast operator
		System.out.println("int to char conversion: "+c5);
		
		byte b1=(byte) d1; // 1 byte
		System.out.println("dounle to byte conversion: "+b1);
	} 

}
