package basic_codes;

public class StaticBlock {
	
	static String college="Sastra"; //This is won't be executed because of the static block
	//static block
	static
	{
		System.out.println("This is static block calling..!");
		System.out.println("Static block is used to initialize static variable");
		college="VEC"; // this gets executed because of static block
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is main calling..!");
		System.out.println(college);
		
	}

}
