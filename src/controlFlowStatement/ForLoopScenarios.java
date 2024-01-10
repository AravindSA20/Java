package controlFlowStatement;

public class ForLoopScenarios {

	public static void main(String[] args) {
		//for loop with if
		
		//Print all even numbers upto 30
		for(int i=1;i<=30;i++) {
			if(i%2==0) {
				System.out.println("Even number: "+i);
			}
		}
		
		System.out.println("-----------------------");
		//Print 2 tables
		for(int i=1;i<=10;i++) {
				System.out.println(i*2); 
		}
		
		System.out.println("-----------------------");
		
		//Nested for loop
		//Print 1 to 10 tables
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j+"\t"); //using print() by neglecting println()
			}
			//after one row completed come to next line
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		//Print * * * * *
		//      * * * * *
        //      * * * * *
        //      * * * * *
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print("*"+" "); //print instead of println
			}
			System.out.println();
		}
		
       System.out.println("-----------------------");
		
		//Print *
		//      * *
        //      * * *
        //      * * * * 
        //      * * * * *
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {   //j<=i
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
       System.out.println("-----------------------");
		
		//Print * * * * *
		//      * * * * 
        //      * * *
        //      * *
		//      *
        for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {    //j=i
				System.out.print("*"+" ");
			}
			System.out.println();
		}
        
        System.out.println("-----------------------");
        
        for(int i=1;i<=4;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
        
        System.out.println("-----------------------");
        
        for(int i=1;i<=4;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
        
        System.out.println("-----------------------");
        
        int a=1;
        for(int i=1;i<=4;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(a+" ");
        		a++;
        	}
        	System.out.println();
        }
        
       System.out.println("-----------------------");
        
        for(int i=1;i<=4;i++) {
        	System.out.println(i);
        }
        for(int i=5;i<=10;i++) {
    		System.out.print(i+" ");
    	}        
        
        
	}

}
