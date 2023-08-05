//package emailapp;

import java.io.*;

public class EmailApp {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your first name :");
		String firstName = br.readLine();	
		
		System.out.println("Enter your last name :");
		String lastName = br.readLine();	
		
		Email em1 = new Email(firstName,lastName); 
	}
}
