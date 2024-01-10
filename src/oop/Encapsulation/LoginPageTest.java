package oop.Encapsulation;

public class LoginPageTest {
	//From LoginPage class
	 
	public static void main(String[] args) {
		LoginPage user1=new LoginPage();
		user1.setUsername("Arjun");;
		user1.setPassword("harolddas");
		user1.doLogin(user1.getUsername(), user1.getPassword());
		
		LoginPage user2=new LoginPage();
		user2.setUsername("Vijay");;
		user2.setPassword("leodas");
		user2.doLogin(user2.getUsername(), user1.getPassword());
	}

}
