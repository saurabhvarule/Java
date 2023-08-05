import java.util.*;
import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException{

		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("company.properties");

		p.load(fis);

		System.out.println(p);
		String str = p.getProperty("Prajwal");
		System.out.println(str);

		p.setProperty("Bhuvanesh","Veritas");
		System.out.println(p);

		FileOutputStream fos = new FileOutputStream("company.properites");
		p.store(fos,"Updated By Saurabh ");
		
	}
}
