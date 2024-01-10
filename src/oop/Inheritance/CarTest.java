package oop.Inheritance;

public class CarTest {

	public static void main(String[] args)
	{
		//parent class ref and parent class obj
		Car c1=new Car();
		c1.price();
		c1.start(); //individual
		c1.refuel();//individual
		c1.stop();  //individual
		c1.breakFeature(); //multilevel inheritance
				
		
		System.out.println("---------------------------");
      
      //child class ref and child class object
        Lamborghini l1=new Lamborghini();
      	l1.price();
      	l1.autoEngine(); //individual method
      	l1.start();   //inherited
      	l1.refuel();  //inherited
      	l1.stop();    //inherited
      	l1.breakFeature(); //multilevel inheritance
      
      	System.out.println("----------------------------");
        		
      //child class ref and child class object
        Ferrari f1=new Ferrari();
        f1.price();
        f1.autoGear(); //Individual
        f1.start();  //Inherited
        f1.refuel(); //Inherited
        f1.stop();   //Inherited
        f1.breakFeature(); //multilevel inheritance

	}

}
