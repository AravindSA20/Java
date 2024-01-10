package basic_codes;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
	//Arithmetic Operators +,-,*,/,%
		int a=20,b=10;
		System.out.println("The Addition is: "+a+b); //this will print 2010 and there wont be addition
		System.out.println("The Addition is: "+(a+b)); //this will perform the addition and print the value as 30
		System.out.println("The Subraction is: "+(a-b)); //this will perform the subtraction and print the value as 10
		System.out.println("The Multiplication is: "+(a*b)); //this will perform the multiplication and print the value as 200
		System.out.println("The Division is: "+(a/b)); //this will perform the division and print the value as 2
		System.out.println("The Modulus is: "+(a%b)); //this will perform modulus and print the reminder value as 0
	
		System.out.println("---------------------------------------");
		
	/* Increment(++) and Decrement(--)
	  
	 * Post Increment - Value will update in next iteration 
	 * a++ ---> a=a+1
	 
	 * Pre-Increment 
	 * ++a ---> a=a+1
	 */
	
	//Increment(++)	
	  //Post Increment 
		System.out.println("Value of a= "+a); // 20
		System.out.println(a++); // 20
		System.out.println(a); //21 - value of a got updated in next iteration
		
	  //Pre-Increment
		System.out.println("Value of b="+b); //10
		System.out.println(++b); //11 - value got updated in first iteration itself because of pre increment
		
	  //Post Increment 
		int c=90;
		int d=c++;
		System.out.println(d); //It will print d as 90 because its first iteration of c
		System.out.println(c); //It will print c as 90 because the value got updated in next iteration
		
      //Pre-Increment	
		int e=30;
		int f=++e;
		System.out.println(f); //It will print f as 31 because it is pre increment value got updated
		System.out.println(e); //It will also print 31 hence the value got updated because of pre increment
		
	System.out.println("-------------------------------------------------");
	
	//Decrement(--)
	  //Post Decrement
	    int g=70;
	    System.out.println("Value of: "+g); //70
	    System.out.println(g--); //70
	    System.out.println(g); //69 - value of a got updated in next iteration
	    
	  //Pre-Decrement
	    int h=20;
	    System.out.println("Value of h: "+h); //20
	    System.out.println(--h); //19- value got updated in first iteration itself because of pre decrement
	    
	  //Post Decrement
	    int i=34;
	    int j=i--;
	    System.out.println(j); // It will print d as 34 because its first iteration of i
	    System.out.println(i); // It will print c as 33 because the value got updated in next iteration
	    
	  //Pre-Decrement
	    int k=65;
	    int l=--k;
	    System.out.println(l);//It will print f as 64 because it is pre decrement value got updated
	    System.out.println(k);//It will also print 64 hence the value got updated because of pre decrement
	}
}
