package oop.Polymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) 
	{
		//parent class ref and parent class object-->parent
		Parent p1=new Parent();
		p1.color();//red
		
		//parent class ref and child class object-->parent+child
		Child c1=new Child();
		c1.color();//blue
		
		//Parent class method is overrided by child class
		//parent parent ref and child class object-->reference matters (parent)
		Parent p2=new Child();
		p2.color();//blue
	}

}
