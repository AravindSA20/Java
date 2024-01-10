package controlFlowStatement;

public class FunctionWithParameter {
    /*
     * Parameter represents variable
     * Arguments represent real data
     */
	public void loginToGmail() //function with 0 parameter
    {
    	String email="aravindsa@gmail.com";
    	String pwd="Messi10";
    	System.out.println("Email: "+email);
    	System.out.println("Password: "+pwd);
    }
    
    //same name cannot be created for two methods in a class
    
    public void loginToAmazon(String email,String pwd) // function with 2 parameter
    {
    	System.out.println("User Email is: "+email);
    	System.out.println("USer Password is: "+pwd);
    }
	public static void main(String[] args) {
		FunctionWithParameter a=new FunctionWithParameter();
		//function without argument
		a.loginToGmail();
		//function with argument
		a.loginToAmazon("shinchan@gmail.com", "Mitzi"); //argument with real data
	}

}
