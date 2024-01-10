package oop.Encapsulation;

class Employee      //default method
{
	//data
	private int id=101;
	private String name="Ajith";
	//Right click on private-->Source-->Generate Getters and Setters-->Manual click the data-->Click Generate Button
	
	//Getter and Setter -public method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//To Access private method - we need public method for data, getter and setter 
	//business logic
	public void show() {
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.show(); //show() will show the details in a method
		System.out.println("----------------------");
		
		//We can update and access the data if its public or default
//		e1.id=110;       //The field Employee.id is not visible -due to private modifier
//		e1.name="Muthu"; //The field Employee.id is not visible -due to private modifier
		
		//To access private data ,use setter and getter
		e1.setId(110);
		e1.setName("Muthu");
		System.out.println(e1.getId()+" \n"+e1.getName());
		System.out.println("----------------------");
		e1.show();
		
	}

}
