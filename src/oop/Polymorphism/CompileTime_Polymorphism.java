package oop.Polymorphism;

public class CompileTime_Polymorphism {
    //Method Overloading (or) Compile Time Polymorphism
	void add() // with zero parameters
    {
    	System.out.println("Addition is:"+(200+100));
    }
    
    //1. Number of parameter
    public void add(int a,int b) // with two parameter
    {
    	System.out.println("Addition is:"+(a+b));
    }
    
    public void add(int a,int b,int c) // with three parameter
    {
    	System.out.println("Addition is:"+(a+b+c));
    }
    
    //2. Change different type of parameter
    public void add(double a,int b) // with two parameter,change in parameter
    {
    	System.out.println("Addition is:"+(a+b));
    }
    
    //3. Change in the order of parameter
    public void add(int a,double b) // with two parameter, change in order of parameters
    {
    	System.out.println("Addition is:"+(a+b));
    }
    
    //Constructor overloading 
    CompileTime_Polymorphism(){
    	System.out.println("This is Default Constructor");
    }
    
    CompileTime_Polymorphism(int id){
    	System.out.println("This is Parameterized Constructor: "+id);
    }
    
    CompileTime_Polymorphism(String name){
    	System.out.println("This is Parameterized Constructor: "+name);
    }
    
    CompileTime_Polymorphism(String name,int id){
    	System.out.println("This is Parameterized Constructor: "+name+" "+id);
    }
    
    
	public static void main(String[] args) {
		CompileTime_Polymorphism p=new CompileTime_Polymorphism();// default constructor will be called
		p.add();             // with zero parameters
		p.add(200, 100);     // with two parameter
		p.add(200, 100, 50); // with three parameter
		p.add(200.20, 100);  // double a,int b -change in parameter
		p.add(200, 100.10);  // int a,double b -change in order of parameter
		
		CompileTime_Polymorphism q=new CompileTime_Polymorphism(90);// parameterized constructor will be called
		                      // reference variable should not be same while calling constructor
		CompileTime_Polymorphism r=new CompileTime_Polymorphism("Aravind",70);// parameterized constructor will be called

	}

}
