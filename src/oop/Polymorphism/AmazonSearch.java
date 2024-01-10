package oop.Polymorphism;

public class AmazonSearch {
	//Static Polymorphism or Compiletime polymorphism or Method Overloading
	public void search(String pname) 
	{
		System.out.println("Product search with Product name: "+pname);
	}
	public void search(int price)
	{
		System.out.println("Product search with Price of the Product: "+price);
	}
	public void search(String bname,String pname)
	{
		System.out.println("Product search with Brand name: "+bname+" & Price: "+pname);
	}
	public void search(String pname,int price)
	{
		System.out.println("Product search with Product name:"+pname+" & Price:"+price);
	}
	
	//No main function here
	
}
