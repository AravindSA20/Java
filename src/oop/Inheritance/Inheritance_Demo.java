package oop.Inheritance;
class A{
	public void m1()
	{
		System.out.println("M1() calling from A class");
	}
}
 
class B extends A //A is parent of B
{ 
	public void m2()
	{
		System.out.println("M2() calling from B class");
	}
}

class C extends B //B is parent of C- Multilevel Inheritance
{
	public void m3()
	{
		System.out.println("M3() calling from C class");
	}
}

class D extends A // A is parent for D- Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("M4() calling from D class");
	}
}

//class X extends B,D
/*
 * Multiple inheritance is not supported in java directly
 * Interface is used to overcome it 
 */

public class Inheritance_Demo {
	public static void main(String[] args) {
		System.out.println("Parent class reference and Parent class object"); 
		A sa1=new A();
		sa1.m1();  // Parent class cant access child class
		System.out.println("------------------------------------");
		
		System.out.println("Child class refrence and child class object");
		B sa2=new B(); //Single
		sa2.m2(); //Individual method
		sa2.m1(); //Inherited method- Child class can access parent class also
		System.out.println("------------------------------------");
		
		System.out.println("Parent class reference and Child class object=(ref)");
		A sa3=new B();
		sa3.m1();
		System.out.println("------------------------------------");
		
		System.out.println("Child class reference and Parent class object=(invalid)");
	//	B sa4=new A(); //Type mismatch: cannot convert from A to B
//		C sa3=new C(); //Multilevel
//		sa3.m3(); //individual method
//		sa3.m2(); //Inherited method
//		sa3.m1(); //Inherited method
//		System.out.println("------------------------------------");
//		
//		D sa4=new D(); //Heirarchical
//		sa4.m4(); //individual method
//		sa4.m1(); //Inherited method
	}
}
