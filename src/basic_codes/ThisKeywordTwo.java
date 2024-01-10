package basic_codes;

public class ThisKeywordTwo {
	public ThisKeywordTwo() {
		this(1520); // it will print parameterized  constructor
		System.out.println("This is Default constructor calling..");
	  //this(1520); Constructor must be first statement of contructor	
	}
	
	public ThisKeywordTwo(int number) {
	//	this(); // it will print default constructor first
		System.out.println("This is Parameterized constructor calling.."+number);
	}
    
	public static void main(String[] args) {
		ThisKeywordTwo s=new ThisKeywordTwo(1520);
	}
}
