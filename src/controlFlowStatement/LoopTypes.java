package controlFlowStatement;

public class LoopTypes {
	public static void main(String[] args) {
		//for(initialization;condition;icr/dec)
		for(int i=1;i<=5;i++) {
			System.out.println("Hi Mitzi!"); //prints 5 times
		}
		
		System.out.println("-----------------------");
		// print 1 to 10 numbers
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		// print 10 to 1 numbers
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
	//  if, for loop does not have initialization, it will run infinite times
	//	for(;;) {
	//		System.out.println("Hi");// will print "Hi" infinite times
	//	}
		
		//while loop
	    int i=1;
	    while(i<=5) {
	    	System.out.println("Welcome"); //prints welcome 5 times
	    	i++;  // if we don't make increment or decrement, the code will run infinite times
	    }
	    
	    System.out.println("-----------------------");
	    //sum of digits
	    int num=123,r,sum=0;
	    while(num>0) {
	    	r=num%10; //123%10, remainder(r) will be 3, q=12
	        num=num/10; //12(quotient)/10
	        sum=sum+r; 
	    }
	    System.out.println("Sum of digits for number 123: "+sum); //1+2+3=6
	   
	    System.out.println("-----------------------");
	    
	    //do while - even when condition is false it will print atleast  one time
	    int j=1;
	    do {
	    	System.out.println("Hello");
	    	j++;
	    }while(j<=5);
	    
	    System.out.println("-----------------------");
	    
	}

}
