package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFIleDemo {

	public static void main(String[] args) throws IOException
	{
		//Get the path
		File f1=new File(System.getProperty("user.dir")+"\\Test.properties");
		FileInputStream fc=new FileInputStream(f1); //add throws declaration
		
		//To read
		Properties p1=new Properties();
		p1.load(fc); //Add throws declaration
		
		System.out.println("Browser Name is: "+p1.getProperty("bname"));
		System.out.println("Version is: "+p1.getProperty("bversion"));
	}

}
