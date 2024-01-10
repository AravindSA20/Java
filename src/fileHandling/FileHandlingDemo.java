package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo
{
    public static void main(String[] args) throws IOException 
    {
		//To create a File
    	File f1=new File(System.getProperty("user.dir")+"\\MyFile.txt"); //getProperty to access the location of system.. \\- to add path for MyFile.txt 
    //	f1.createNewFile(); //add throws declaration --- Refresh Java to view file after running the program
    	System.out.println("New File is created");
    	
    	System.out.println("----------------------------");
    	
    	//To Write a file
    	FileWriter wr=new FileWriter("MyFile.txt");
    	wr.write("Lionel Messi is G.O.A.T !");
    	wr.write("\nMessi is Most decorated player in the History of Foootball");
    	System.out.println("File has been written");
    	wr.close();
    	
    	System.out.println("----------------------------");
    	
    	//To Read a file - we can read the file and print it in console
    	 System.out.println("Reads Contents of the File:\n");
    	 Scanner sc=new Scanner(f1); //f1- object of file
    	 while(sc.hasNextLine())
    	 {
    		 System.out.println(sc.nextLine());
    	 }
    	 sc.close();
    	 
    	 System.out.println("----------------------------");
    	 
    	 //To Delete a file
    	 f1.delete();
    	 System.out.println("File is Deleted!");
	}
}
