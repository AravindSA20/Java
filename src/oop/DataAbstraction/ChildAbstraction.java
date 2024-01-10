package oop.DataAbstraction;

public class ChildAbstraction extends AbstractionDemo {
     //By right clicking on ChildAbstraction, we can add unimplemented methods
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		
//	}
	
	public void childM()
	{
		System.out.println("childM() This is called class individual method");
	}
	
	@Override
	public void show() {
		System.out.println("Show() is inherited abstract method");
		System.out.println("Show() is implemented by its child class");
	}
	
    public static void main(String[] args) 
    {
    	//Child class ref and child class object
    	ChildAbstraction c1=new ChildAbstraction();
    	c1.accept(); //individual
    	c1.childM(); //individual
    	c1.show(); //inherited abstract method-override
    	
    	//parent class ref and parent class object- Invalid
    	//Cannot instantiate the type AbstractionDemo
    	   //AbstractionDemo d1=new AbstractionDemo();    	
    	
    	//parent class ref and child class object
    	AbstractionDemo d1=new ChildAbstraction();
    	d1.accept();
    	d1.show();
    	
    	//child class ref and parent class object - Invalid
		
	}

	
}
