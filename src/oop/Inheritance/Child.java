package oop.Inheritance;

public class Child extends Parent 
{
	int cid=202;
	public void childIncome() 
	{
		System.out.println("Parent Id is: "+super.pid);
		super.parentIncome();
		System.out.println("Child Id is: "+cid);
		System.out.println("Parent Income is $70000");
	}
	
	public Child()
	{
		super(); //super constructor
		System.out.println("This is Default constructor from Child");
	}

	public static void main(String[] args) 
	{
		Child c1=new Child();
		c1.childIncome();
		
	}

}
