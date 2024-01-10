package basic_codes;

public class Employee {
	int empid;
	String empname;
	
	public void display() {
		System.out.println("Employee ID:   "+empid);
		System.out.println("Employee name: "+empname);
	}
	public static void main(String[] args) {
		
	Employee e1=new Employee();
	e1.empid=101;
	e1.empname="Oliver Kahn";
	e1.display();
	
	Employee e2=new Employee();
	e2.empid=103;
	e2.empname="Paolo Maldini";
	e2.display();
	
	Employee e3=new Employee();
	e3.empid=107;
	e3.empname="David Beckham";
	e3.display();
	
	Employee e4=new Employee();
	e4.empid=108;
	e4.empname="Andres Iniesta";
	e4.display();
	
	Employee e5=new Employee();
	e5.empid=110;
	e5.empname="Lionel Messi";
	e5.display();
	}
}
