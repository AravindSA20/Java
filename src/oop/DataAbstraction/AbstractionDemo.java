package oop.DataAbstraction;

public abstract class AbstractionDemo  //abstract class
{
	/*
	 * Class declare with abstract keyword
	 * Class can have implemented and non-implemented methods
	 * Non-implemented method means having method without body-abstract method
	 * When class is not fully implemented, we can't create Object for that class
	 * All methods need to be implemented by its child class
	 * Abstract class helps you to use partial abstraction
	 */
	
	//implemented
	public void accept()
	{
		System.out.println("accept() This is implemented method");
	}
	
	//abstract
	public abstract void show();
	
	public static void main(String[] args) 
	{
		//Cannot initiate the type AbstractDemo
		//AbstractDemo a1=new AbstractDemo();
		
	}
	

}
