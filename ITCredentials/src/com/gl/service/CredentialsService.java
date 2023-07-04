package com.gl.service;
import com.gl.Interface.*;
import java.util.Random;
import com.gl.model.*;
//import com.gl.service.String;
public class CredentialsService implements ICredentials{

	public CredentialsService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateEmailAddress(String f_Name, String l_Name, String department) {
		// TODO Auto-generated method stub
		return f_Name+l_Name+"@"+department+".gl.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		
		String password="";
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String digits="0123456789";
		String symbols="!@#$%^&*()";
		
		String values=caps+lowerCase+digits+symbols;
		Random random = new Random();
		for(int i=0;i<2;i++) {
			int index= random.nextInt(caps.length());
			char c=caps.charAt(index);
			
			password+=String.valueOf(c);
			
		}
		
		for(int i=0;i<2;i++) {
			int index= random.nextInt(lowerCase.length());
			char c=lowerCase.charAt(index);
			
			password+=String.valueOf(c);
			
		}
		
		for(int i=0;i<2;i++) {
			int index= random.nextInt(digits.length());
			char c=digits.charAt(index);
			
			password+=String.valueOf(c);
		}
		
		for(int i=0;i<2;i++) {
			int index= random.nextInt(symbols.length());
			char c=symbols.charAt(index);
			
			password+=String.valueOf(c); // 8
			
		}
		
		String result="";
		for(int i=0;i<8;i++) {
			int index= random.nextInt(password.length());
			char c=password.charAt(index);
			
			result+=String.valueOf(c);
			
		}
		password=result;
		
		
		return password;
	}
		
		
	

	@Override
	public void showCredentials(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Hi "+emp.getF_Name()+" "+emp.getL_Name()+". Following are the credentials: ");
		System.out.println("Email is: "+emp.getEmail());
		System.out.println("Password is: "+emp.getPassword());
		
	}

}
