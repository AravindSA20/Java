package controlFlowStatement;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello!"; //Literal Way
		String s2=new String("Hello!"); //Using new
		System.out.println(s1==s2); //false only because the IDs of the objects are not same using new keyword way
	    
		String s3="Hello!"; //Literal way
		System.out.println(s1==s3); //true because both IDs of object are same using literal way
		
		//String is Immutable - can't change data at same memory location
		s1=s1+"All";
		System.out.println(s1==s3); // false since s1 is changed to "Hello!All"
		
		System.out.println("-------------------------");
		
		// length()
		String a1="Hello Shinchan!";
		System.out.println("Length of the Strin: "+a1.length()); // 15		
		
		//to get character from String, we use charAt(index)
		System.out.println("Character at index 8: "+a1.charAt(8)); //i (index starts from 0)
		
		/* Equality between String - Compares data
		   1. equals() - Exact matching (case sensitive)
		   2. equalsIgnoreCase() - Not a case sensitive
		 */
		String a2="OPPIE is directed by Cristopher Nolan";
		String a3="oppenheimer is directed by cristopher nolan";
		System.out.println("With equals() : "+a2.equals(a3)); //false
		System.out.println("With equalsIgnoreCase(): "+a2.equalsIgnoreCase(a3)); //true
		
		//toUpperCase , toLowerCase
		System.out.println("Uppercase: "+s2.toUpperCase());
		System.out.println("Lowercase: "+s2.toLowerCase());
		
		//contains() - partial string match
		System.out.println("Test for OPPIE: "+a2.contains("OPPIE")); //true
		System.out.println("Test for Oppie: "+a2.contains("Oppie")); //false
	    
		//trim() -ignore white space before and after the string
		String a4="   Welcome all    ";
		System.out.println(a4);
		System.out.println(a4.trim());
		
		// startswith(prefix)  
		String msg="Appium is mobile application testing tool";
		System.out.println("Is String starts with Appium?:"+msg.startsWith("Appium")); //true
		System.out.println("Is String starts with Appium?:"+msg.startsWith("App")); //true
		System.out.println("Is String starts with Appium?:"+msg.startsWith("A")); //true
		System.out.println("Is String starts with Appium?:"+msg.startsWith("Selenium")); //false
		System.out.println("Is String starts with Appium?:"+msg.startsWith("Aw")); //false
		System.out.println("Is String starts with Appium?:"+msg.startsWith("appium")); //false
		
		// endswith(suffix)
		System.out.println("Is String ends with tool?:"+msg.endsWith("tool")); //true
		System.out.println("Is String ends with tool?:"+msg.endsWith("ol")); //true
		System.out.println("Is String ends with tool?:"+msg.endsWith("l")); //true
		System.out.println("Is String ends with tool?:"+msg.endsWith("il")); //false
		System.out.println("Is String ends with tool?:"+msg.endsWith("fool")); //false
		System.out.println("Is String ends with tool?:"+msg.endsWith("Tool")); //false
		
		// split(Regular Expression)  RE-pattern matching
		String tools="Selenium,Appium,POstman,API,JMeter";
		System.out.println(tools);
		
		String arr[]=tools.split(",");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----------------------");
		
		String cMonth="November 2023";
		String data[]=cMonth.split(" "); //Split method
		System.out.println(data[0]); //November
		System.out.println(data[0].charAt(0)); //N
		System.out.println(data[1]); //2023
		
		//Iterate method
		for(String i:data) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		/*
		 * Java provides two predefined mutable classes don't work with literal way, we have to use new keyword only
		         1. StringBuffer                    2. StringBuilder
		       *    Synchronize  (older)               Non-synchronize (latest)
		       *    At a time , one process            At a time, it can handle multiple process 
		 * These class provides methods to reverse() a string
		 
		 * String is immutable and in string, we don't have reverse()
		 */
		
		//Reverse a string using StringBuilder
		StringBuilder sa=new StringBuilder("Shinchan");
		
		sa.append("Mitzi"); // merge -append
		System.out.println(sa);
		System.out.println("Reverse is:"+sa.reverse());
		
		//Reverse a string using logic by for loop
		String s="Susila";
		String result="";
		
		for(int i=s.length()-1;i>=0;i--) {
			  //i=5
			result=result+s.charAt(i);
		}
		System.out.println("Reverse of "+s+" is "+result);
		
	}

}
