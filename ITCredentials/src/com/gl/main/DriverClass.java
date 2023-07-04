package com.gl.main;
import java.util.Scanner;
import com.gl.model.*;
import com.gl.Interface.ICredentials;
import com.gl.service.CredentialsService;
public class DriverClass {

	public DriverClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter first name: ");
		String firstName =sc.next();
		
		System.out.println("Please last first name: ");
		String lastName = sc.next();
		Employee e = new Employee(firstName, lastName);
	
		System.out.println("Enter your department from the following:\n");
		System.out.println("1.Technical \n2.Admin \n3.Human Resource \n4.Legal\n");
		int ch=0;
		String generatedPassword=null;
		String generatedEmail=null;
		
		ch=sc.nextInt();
		ICredentials ic = new CredentialsService(); 
			

		
		
			
			
		switch(ch)
		{
		
		case 1: {	generatedEmail=ic.generateEmailAddress(firstName, lastName, "Technical");
					generatedPassword= ic.generatePassword();
					break;}
				
		case 2:{ 	generatedEmail=ic.generateEmailAddress(firstName, lastName, "Admin");
					generatedPassword= ic.generatePassword();
					break;}
		
		case 3:{	generatedEmail=ic.generateEmailAddress(firstName, lastName, "Human resource");
					generatedPassword= ic.generatePassword();
					break;}
		
		case 4:{	generatedEmail=ic.generateEmailAddress(firstName, lastName, "Legal");
					generatedPassword= ic.generatePassword();
					break;}
		
		default:{System.out.println("Enter a valid option");}
		}
		
		
		e.setEmail(generatedEmail);
		e.setPassword(generatedPassword);
		ic.showCredentials(e);	
	
		
		
	}
	}


