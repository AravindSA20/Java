package basic_codes;

public class AccessModifier {
	/* There are four types of Access modifiers in java
	 * default -access within same class and same package only, no keyword 
	 * public  -access everywhere
	 * private -access within same class only
	 * protected -access within same class and package, using inheritance we can call different package
	 */
	
	//instance variable
	int id=101;						//default
	public String name="Messi";     //public
	private long phno=9845690010L;  //private
    protected int accno=346865732;  //protected
    
   /*
    * protected data can be accessed ins ame class,same package,
      but, in different package only with subclass(child class) we can access
    */
    
	public static void main(String[] args) {
		AccessModifier sa=new AccessModifier();
		System.out.println(sa.id);
		System.out.println(sa.name);
		System.out.println(sa.phno);
		System.out.println(sa.accno); //same class

	}

}
