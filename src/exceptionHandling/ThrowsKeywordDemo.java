package exceptionHandling;

public class ThrowsKeywordDemo
{
	//We need to add throws declaration in every used method
    public void m1() throws InterruptedException
    {
    	m2(); // Add throws declaration because method m1 is calling m2
    }
    public void m2() throws InterruptedException
    {
    	System.out.println("M2 is calling");
    	Thread.sleep(3000); // Add throws declaration
    	System.out.println("M2 call completed");
    }
	public static void main(String[] args) throws InterruptedException {
		ThrowsKeywordDemo t1=new ThrowsKeywordDemo();
		t1.m1(); //Add throws declaration because main method calls m1()
	}

}
