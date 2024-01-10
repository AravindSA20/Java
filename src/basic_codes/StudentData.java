package basic_codes;

public class StudentData {
	//data
	int id; // Default value of int is 0 (if we don't declare any data)
	String name; // Default value of String is null (if we don't declare any data)
	
	//function
	public void show(){
		System.out.println("Student ID is: "+id);
		System.out.println("Student Name is: "+name);
	}
	
	public static void main(String[] args) {
	//Entry Point
      /*
       * To access class members (data+function)
       * We need to create object with object name and .(dot) operator, you can access details of class
       */
	    StudentData d=new StudentData();
		//initialize data
		d.id=10;
		d.name="Messi";
		d.show();
		
		System.out.println("------------------------------------");
		
		StudentData d1= new StudentData();
		d1.id=9;
		d1.name="Lewandowski";
		d1.show();
		
		System.out.println("------------------------------------");
		
		StudentData d2=new StudentData();
		d2.id=11;
		d2.name="Neymar";
		d2.show();
		
		
	}

}
