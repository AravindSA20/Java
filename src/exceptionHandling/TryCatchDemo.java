package exceptionHandling;

public class TryCatchDemo {
	
	//We dont need to surround with try catch in every method like throws keyword
	 public void m1() //throws InterruptedException
	    {
	    	m2(); 
	    }
	    public void m2() //throws InterruptedException
	    {
	    	System.out.println("M2 is calling");
	    	try {
				Thread.sleep(3000); //Surround with try catch block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); //Prints this throwable and its backtrace to thestandard error stream
			} // 
	    	System.out.println("M2 call completed");
	    }
		public static void main(String[] args) 
		{
			TryCatchDemo t1=new TryCatchDemo();
			t1.m1(); //Add throws declaration because main method calls m1()
		}

}
