package com.priya;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeService emp = new EmployeeService();
		while(true)
		{
			System.out.println("1.Add Employee\n2.View employees\n3.Update employee\n4.View employee\n5.Delete employee\n6.import1\n7.Export1\n8.exit");
			System.out.println("Enter your choice:");
			Scanner sc = new java.util.Scanner(System.in);
			int choice = sc .nextInt();
			
			switch(choice)
			{
			case 1: emp.add();
				break;
			case 2: emp.viewAll();
				break;
			case 3: emp.update();
				break;
			case 4: emp.view();
				break;
			case 5: emp.delete();
				break;
			case 6: emp.import1();
			    break;
			case 7: emp.export1();
			    break;
			case 8: System.exit(0);
				break;
			default: System.out.println("Invalid choice.");
						break;
			
			}
			
			
		}

	}

}