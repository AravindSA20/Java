package basic_codes;

public class ConstructorWithThis {
	
	//instance variable
	int id;
	String name;
	
	//Parameterized constructor
	public ConstructorWithThis(int id,String name) //local variable
	{
		//name conflict
		//id=id;
		//name=name;
		//current class variable=local variable
		this.id=id;
		this.name=name;
	}
	
	public void show() {
		System.out.println("Student ID is: "+id);
		System.out.println("Student Name is: "+name);
	}
	
	public static void main(String[] args) {
		ConstructorWithThis c=new ConstructorWithThis(91,"Lionel messi");
		c.show();
	}

}
