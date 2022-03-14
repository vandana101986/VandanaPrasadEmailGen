package com.gl.main;
import java.util.Scanner;
import com.gl.emailService.CredentialService;
import com.gl.model.Employee;

public class EmailGeneration {

	public static void main(String[] args) {

		System.out.println("Please Enter the department from the following :");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc=new Scanner(System.in);
		int dept=sc.nextInt();
		Employee e1=new Employee();
		CredentialService cs=new CredentialService();
		switch(dept)
		{
				
			case 1:
				e1.setDepartment("tech");				  
				cs.showCredentials(e1);
				break;
			case 2:
				e1.setDepartment("admin");
				cs.showCredentials(e1);
				break;
			case 3:
				e1.setDepartment("hr");
				cs.showCredentials(e1);	
				break;
			case 4:
				e1.setDepartment("legal");
				cs.showCredentials(e1);	
				break;
		}
		

	}

}
