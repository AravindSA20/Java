package controlFlowStatement;

public class ReturnKeyword {
    //method without return
	public void add() {
    	int a=100,b=100; // local to add()
    	System.out.println("Addition: "+(a+b));
    }
	//method with return
	public int sub() {
		int a=100,b=75;  // local to sub()
		return a-b; // return data to calling method
	}
	
	public String msg() {
		String a="Hi Mitzi!";
		return a;
	}
	
	//main function
	public static void main(String[] args) {
		ReturnKeyword r1=new ReturnKeyword(); //calling method
		r1.add(); //calling add method
		
		int result=r1.sub();
		System.out.println("Subtraction :"+result);
		// (or)
		System.out.println("Subtraction output :"+r1.sub());
		
		String sa=r1.msg();
		System.out.println(sa);
		// (or)
		System.out.println(r1.msg());
	}

}
