package array;

import basic_codes.AccessModifier; //we have to type this to get definition by import a particular class from other package
import basic_codes.*; // .* defines we can access every class from a package
public class DifferentPackage extends AccessModifier {

	public static void main(String[] args) {
		// For AccessModfier class
		AccessModifier sa2=new AccessModifier();
		System.out.println(sa2.name); //public
		
		//child class(subclass)
		DifferentPackage d1=new DifferentPackage();
	    System.out.println("Protected Data: "+d1.accno);
	    System.out.println(d1.name);
		
		// whereas default,private,protected cant be accessed directly from other packages
	}

}
