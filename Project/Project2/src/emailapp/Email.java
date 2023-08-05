//package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int passwordLength = 10;
	private int mailboxCapacity = 800;
	private String alternateEmail;
	private String companySuffix = "puzzles.com";


	//Constructor to recieve first name and last name
	public Email(String firstName,String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

		//call for method to ask department and return the department
		this.department = setDepartment();
		System.out.println("Department : " + department);

		this.password = generatePassword(passwordLength);
		//System.out.println("Your Password is : " + password);

		// combine elements to generate email 

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	//	System.out.println(email);
		
		
		System.out.println("Email Created : " + this.firstName + " "+ this.lastName +"\n\nfollowing are your details :");
		//call for method to show information
		System.out.println("");
		showInfo();

			

	}

	// ask for the department
	private String setDepartment() {

		System.out.println("Department codes :\n 1 for Sales \n 2 for Developement\n 3 for Accounting\n 4 for Testing\n 5 for Security\n 0 for None\nEnter department code :");
		Scanner sc = new Scanner(System.in);
		int dprtChoice = sc.nextInt();
		
		switch(dprtChoice) {

			case 1:
				return "sales";
			case 2:
				return "dev";
			case 3:
				return "acct";
			case 4:
				return "tst";
			case 5:
				return "sec";
			default:
				return "";
		}
	}
	
	// generate random password
	private String generatePassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rndm = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rndm);

		}
		return new String(password);

	}
	
	//set email box capacity
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	
	public void setAlternateEmail(String altEmail) {

		this.alternateEmail = altEmail;
	}


	
	//change the password
	
	public void changePassWord(String password) {

		this.password = password;
	}

	public int getMailboxCapacity() { return mailboxCapacity; }

	public String getAlternateEmail() {return alternateEmail; }

	public String getPassword() {return password; }

	// show information
	
	public void showInfo() {

		System.out.println("Name :" + firstName + " " + lastName + "\nCompany Email :" + email + "\nPassword :"+password);
	}
}
