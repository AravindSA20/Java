package basic_codes;

public class InstanceVsStaticVariable {
	//Instance variable will get new memory for every object
	//    int count=1;  // output will be 1 1 1 1 1
	
	//Static Varaible will create memory one time and it will share with every object
	      static int count=1;  //output will be 1 2 3 4 5
	      
	  public InstanceVsStaticVariable() {
		  System.out.println(count); 
		  count++;
	  }
	  
	  public static void main(String[] args) {
		  InstanceVsStaticVariable i1=new InstanceVsStaticVariable();
		  InstanceVsStaticVariable i2=new InstanceVsStaticVariable();
		  InstanceVsStaticVariable i3=new InstanceVsStaticVariable();
		  InstanceVsStaticVariable i4=new InstanceVsStaticVariable();
		  InstanceVsStaticVariable i5=new InstanceVsStaticVariable();
	}
 
}
