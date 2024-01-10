package basic_codes;

public class DataTypeCode {
	public static void main(String args[]) {
//Boolean Data type
	/*
	 * Boolean true/false size ---> 1 Bit
	 * By Default, Boolean is False
	 */
		boolean status=false;
		System.out.println("Boolean Data is:\t"+status);
		status=true;
		System.out.println("New Updated Data is:\t"+status);


	System.out.println("--------------------------------------");

//Character Data type
	/*
	 * Character data type size ---> 2 byte
	 	1.Single Character
	 	2.Special Character
	 	3.Uni Code(ASCII)
	 * Numeric Family
	 * ASCII Code
	    -> A to Z: 65 to 90
	    -> a to z: 97 to 122
	    -> 0 to 9: 48 to 57
	 */
		char c1='A';
		System.out.println("Character Data is:         "+c1);
		char c2='$';
		System.out.println("Special Character Data is: "+c2);
		
		char c3=90; //c3 accepting 90 as ASCII value for some other character
		System.out.println("Character for ASCII 90 is: "+c3);  // Z
		
		char c4=99;
		System.out.println("Character for ASCII 99 is: "+c4);  // c
		
		char c5=48;
		System.out.println("Character for ASCII 48 is: "+c5);
		
	System.out.println("--------------------------------------------------");
	  
	/*
	 * Integral--->Integer
	    1. byte
	    2. short
	    3. int (by default any number)
	    4. long
	 */
	
// 1. byte size--> 1 byte (-128 to 127)
	 byte b1=125;
	 System.out.println("Byte data is:  "+b1);
	 byte b2=-126;
	 System.out.println("Byte data is: "+b2);
   //Type mismatch: Cannot be converted int to byte
	 // byte b3=-129;
	 // byte b4=150;
	 
// 2. short size--> 2 byte (-32768 to 32767)
	 short s1=15000;
     System.out.println("Short data is: "+s1);
     short s2=-31222;
     System.out.println("Short data is: "+s2);
   //Type mismatch: Cannot be convert int to short
   	 // short s3=33333; 
     // short s4=-18000;
     
// 3. int size--> 4 byte (by default every number in java is int type)
     int i1=90099;
     System.out.println("Integer data is: "+i1);
     int i2=8234789;
     System.out.println("integer data is: "+i2);
   //The literal 9999999999 of type int is out of range
     // int i3=9999999999;
     
// 4. long size--> 8 byte (suffix L)
     long l1=9999999999L;
     System.out.println("Long data is: "+l1);
     long l2=789;
     System.out.println("Long data is: "+l2);
     
  System.out.println("-------------------------------------");
  
      /*
       * Floating Point
           1. float
           2. double
       */

 // 1. float size--> 4 byte (suffix F)
      float f1=45.66F;
      System.out.println("Float data is:" +f1);
      //Type mismatch: cannot convert from double to float
      // f1=45.66; (no suffix F)    
      
 // 2. double (default type)
      double d1=98345.9922;
      System.out.println("Double data is: "+d1);
      
	}
}

