package basic_codes;

public class MethodTypes {
	
	public void start() {
       System.out.println("Instance method is calling..");
	}
	
	public static void run() {
		System.out.println("Static method is calling..");
	}
	
	public static void main(String[] args) {
		//Static method, we can call without Object
		//Static method, we can call directly without class name(same class)
		//Static method, we can call with class name (different class calling)
		run();  //without class name
		MethodTypes.run(); // To create any reusable code
		
		MethodTypes m1=new MethodTypes();
		m1.start();
		//The static method run() from the type MethodTypes should be accessed in a static way
		m1.run(); //yellow mark shown but code will run
	}
}	
