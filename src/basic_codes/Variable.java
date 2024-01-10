package basic_codes;

public class Variable {
    /*
     * Instance variable and instance method will get the memory of object creation
     * Foe every new object, instance variable get a new memory
     
     * Static variable will get the memory only one time inside the class load area
       and same copy of memory will get shared with every object
     */
	int id; // instance variable
	static String company="Infosys";
	
	public void display() {
		int marks=99;//local variable
		System.out.println("Student ID is: "+id);
		System.out.println("Marks from display():"+ marks);
		System.out.println("Company Name: "+company);
	}
	
	
	public static void main(String[] args) {
		int marks=100; // local variable
		System.out.println("Marks from main(): "+marks); //100 will be printed
		
		//create object to call anything from class
		Variable v1=new Variable();
		v1.display(); // 99 will also be printed
		v1.id=101;
		System.out.println("ID is:"+v1.id);
		
		System.out.println("Company Name: "+company);
	}

}
