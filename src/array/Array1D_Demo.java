package array;

public class Array1D_Demo {

	public static void main(String[] args)
	{
		//Array - 1D new keyword
		
		//1.new method
//		int sid[]=new int[5];
//		//index= 0 to 4
//		sid[0]=101;
//		sid[1]=102;
//		sid[2]=103;
//		sid[3]=104;
//		sid[4]=105;
		
		//2.Literal method
		int sid[]= {101,102,103,104,105};
		
		System.out.println("Length of the Array: "+sid.length);//5
		System.out.println(sid[3]);//104
		System.out.println(sid[0]);//101
		
	  //System.out.println(sid[5]);//ArrayIndexOutofBoundsException because index cant be 5
		// for()
		System.out.println("--- Iterate Array using simple for loop ---");
		for(int i=0;i<=4;i++)  //for(int i=0;i,sid.length;i++)
		{   
			System.out.println(sid[i]);
		}
		// for each
		System.out.println("--- Iterate Array using for each loop ---");
        for(int i:sid) {
        	System.out.println(i);
        }
        
		System.out.println("------------------------");
		
		//1.new keyword method
//		String studentName[]=new String[3];
//		studentName[0]="Sanju";
//		studentName[1]="Madhan";
//		studentName[2]="Arun";
		
		//2.Literal method
		String studentName[]= {"Sanju","Mitzi","Butterscotch"};
		
		System.out.println("Total Students: "+studentName.length);
		System.out.println("Zeroth position: "+studentName[0]);
		//for
		for(int i=0;i<=2;i++)
		{
			System.out.println(studentName[i]);
		}
		//for each
		System.out.println("--- Iterate Array using for each loop ---");
		for(String i:studentName) {
			System.out.println(i);
		}
		
		
		System.out.println("----------------------------");
		
		//1.new keyword method
//		double marks[]=new double[3];
//		marks[0]=82.25;
//		marks[1]=77.50;
//		marks[2]=67.75;
		
		//Literal method
		double marks[]= {82.25,77.50,67.75};
		
		System.out.println("Length of Array: "+marks.length);
		System.out.println("Total Marks are: "+(marks[0]+marks[1]+marks[2]));
		//for
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		//for each
		System.out.println("--- Iterate Array using for each loop ---");
		for(double i:marks) {
			System.out.println(i);
			
		}
		
		System.out.println("----------------------------------------------");
		
//		Object is super class in java
//		For, primitive data,there wonn't be any id
//		For an object,there will be id,String is a class in java so it has an id
		//Literal Way
		Object empData[]= {"Lionel Messi","RightWinger",'M',10,8056129980L,89.78};
		System.out.println("Length is: "+empData.length);
		
		System.out.println(empData[4]); //8056129980
		for(Object i:empData) {
			System.out.println(i);
		}
	}

}
