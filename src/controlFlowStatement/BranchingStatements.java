package controlFlowStatement;

public class BranchingStatements {
    //break; continue; return; 
	
	//return;
	public boolean status() {
		return true; //return method
	}
	
	public static void main(String[] args) {
		//break;
		for(int i=1;i<=10;i++) {
			if(i>=5) {
				break; //Exit from the loop
			}
			else {
				System.out.println(i);
			}
		}
        System.out.println("Exit from the loop");
        
        System.out.println("---------------------");
         
        //continue;
        for(int i=1;i<=10;i++) {
        	if(i==5) {
        		continue; // will skip when i=5
        	}
        	else {
        		System.out.println(i);
        	}
        }
        
        //return;
        BranchingStatements r=new BranchingStatements(); //Calling method
        boolean sts=r.status(); //return data to calling method
        System.out.println("Current Status:"+sts); //true
        // (or)
        System.out.println("Current Status is: "+r.status()); //true
	}

}
