package basic_codes;

public class Constructor {
	
	//instance - Current class variable
	int id;
	String name;
	
	//Default Constructor
	public Constructor() // zero argument/parameter
	{
		System.out.println("Student ID is: "+id);
		System.out.println("Student name is:"+name);
	}

	//Parameterized Constructor (declare)
	public Constructor(int i,String n) // 2 parameters
	// set the data to instance variable
	{
		id=i;
		name=n;
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}
	
	public static void main(String[] args) {
		
		Constructor c1=new Constructor(); // Default Constructor
		
		Constructor c2=new Constructor(107,"David Beckham");
	}

	
}
