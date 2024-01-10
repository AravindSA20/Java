package oop.Polymorphism;

public class Child extends Parent
{
   //@ - Rule(annotation)
	@Override
	public void color()
	{
		System.out.println("Color is Blue from Child");
	}
	
	/*
	 * Child override parent class method
	 */
}
