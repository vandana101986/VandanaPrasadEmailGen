package com.gl.emailService;
import java.util.Scanner;
import com.gl.model.Employee;

import java.util.Random;


public class CredentialService {
	
	Scanner sc=new Scanner(System.in);	
	String pwd;	
	Employee e=new Employee("vandana","prasad");

	public String generatePwd() {
		
		Random r1=new Random();
		
		char lower1=(char)(r1.nextInt(26)+'a');
		char lower2=(char)(r1.nextInt(26)+'a');
		char upper1=(char)(r1.nextInt(26)+'A');
		char upper2=(char)(r1.nextInt(26)+'A');
		
		String special="@$%&!";
		char sChar1=special.charAt(r1.nextInt(special.length()));
		char sChar2=special.charAt(r1.nextInt(special.length()));
		
		String num="0123456789";
		char n1=num.charAt(r1.nextInt(num.length()));
		char n2=num.charAt(r1.nextInt(num.length()));
		
		pwd=String.format("%s%s%s%s%s%s%s%s",upper1,upper2,lower1,lower2,sChar1,sChar2,n1,n2);
		return pwd;
				
		}
		
		

	public String generateEmailAdd(Employee emp) {
		return e.getFirstName()+e.getSecondName()+"@"+emp.getDepartment()+".abc.com";	
		}
	
	
	public void showCredentials(Employee emp) {
		System.out.println("Your Credentials are : ");		
		System.out.println("Email Address : "+generateEmailAdd(emp));
		System.out.println("Password : "+generatePwd());
		
	}
}
