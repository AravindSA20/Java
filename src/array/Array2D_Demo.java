package array;

public class Array2D_Demo {

	public static void main(String[] args) {
		//Two dimensional[2D] (or) Multi-dimensional array
		
		//Using new keyword
		int arr[][]=new int[2][3]; 
		//row 0
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		//row 1
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println("Length of the Row: "+arr.length); //2
		System.out.println("Length of the Column: "+arr[0].length); //3
		//if we calculate any one specific row arr[0] or arr[1], so we can find the length of column
	
		//single data
		System.out.println(arr[0][1]); //20
		System.out.println(arr[1][2]); //60
	//	System.out.println(arr[1][3]); //ArrayIndexOutOfBoundsException will occur because index value 3 out of boundary 
	
		System.out.println("------Iteration of for loop------");
		//for loop
		for(int i=0;i<arr.length;i++) {           //for(int i=0;i<=1;i++)
			for(int j=0;j<arr[i].length;j++) {    //for{int j=0;j<=2;j++)
				System.out.print(arr[i][j]+"\t"); // using print in inner loop
			}
			System.out.println();                 // using println in outer loop
		}
		
		System.out.println("------Iteration of for each loop------");
		//for each loop
		for(int i[]:arr)  //i is row which has collection of data{10,20,30}, so we are using i[] as array
		{
			for(int j:i) {                 //j is the column
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------");
		
		//literal way
		int sid[][]= {{10,20},{30,40},{50,60}};
	    //             row 1 , row 2 , row 3
		System.out.println("Total rows: "+sid.length);
		System.out.println("Total columns: "+sid[0].length);
		
		System.out.println(sid[1][0]); //30
		System.out.println(sid[2][1]); //60
		System.out.println("-------------------");
		for(int i[]:sid) {
			for(int j:i){
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		String sa[][]= {{"Messi","Argentina","RW"},{"Ronaldo","Brazil","ST"},{"Henry","France","LW"}};
		               //        row 1            ,         row 2           ,         row 3
		System.out.println("Number of rows: "+sa.length);
		System.out.println("Number of columns: "+sa[0].length);
		
		System.out.println(sa[2][1]); //France
		System.out.println(sa[0][1]); //Argentina
		System.out.println("----------------------------------");
		for(String i[]:sa) {
			for(String j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("-----Username & Password-----");
		
		String user[][]= {{"aravind20@gmail.com","shinchan123"},{"sanju15@gmail.com","mitzi"},{"messi10@gmail.com","magician"},{"lewy9@gmail.com","goalmachine"},{"madhan26@gmail.com","rohitsiva"}};
                       //            row 1                   ,         row 2               ,           row 3                .          row 4                  ,            row 5
		System.out.println("Number of rows: "+user.length);
		System.out.println("Number of columns: "+user[0].length);
		
		System.out.println(user[1][0]); //sanju15@gmail.com
		System.out.println(user[2][1]); //magician
		System.out.println(user[0][1]); //shinchan
		
		System.out.println("---------------for loop-------------------");
		for(int i=0;i<user.length;i++) {
			for(int j=0;j<user[0].length;j++) {
				System.out.print(user[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("---------------for each loop-------------------");
		for(String i[]:user) {
		for(String j:i) {
			System.out.print(j+"\t");
		}
		System.out.println();
		}
		
		System.out.println("------------------------------------------------------------");
	}
}
