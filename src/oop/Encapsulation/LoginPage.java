package oop.Encapsulation;

public class LoginPage 
{
   //data
	private String username;
    private String password;
    
   //public method 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
   
	//Business logic
	public void doLogin(String un,String pwd) {
		System.out.println("User Login completed successfully!");
		System.out.println("User Login with Name: "+un);
	}
   //Go to LoginPgaeTest class
}
