package basic_codes;

public class HelloWorld {
	public static void main(String args[])
	{
		System.out.println("Hello World!");
		
		System.out.println("-------------------------------");
		
		//MethodTypes class
		MethodTypes.run(); //static method is called here
		
		System.out.println("-------------------------------");
		
		//AccessModifier Class
		//same package where AccessModifier with different class HelloWorld
		AccessModifier sa1=new AccessModifier();
		System.out.println(sa1.id);   //default
		System.out.println(sa1.name); //public
		System.out.println(sa1.accno);//protected
		//whereas private cant be visible/accessed by another class
	}
}
