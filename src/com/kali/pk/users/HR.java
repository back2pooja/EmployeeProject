package com.kali.pk.users;

import java.util.Enumeration;
import java.util.Scanner;

import com.kali.pk.bean.Employee;
import com.kali.pk.dao.Company;
import com.kali.pk.exceptions.DuplicateEmployeeException;
import com.kali.pk.exceptions.EmployeeClassNotFoundException;
import com.kali.pk.exceptions.EmployeeNotFoundException;

public class HR {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)){
			Company c = new Company();
			
			loop:while(true) {
				
				System.out.println("\n Choose one option: ");
				System.out.println(" 1. Create Employee");
				System.out.println(" 2. Get one Employee");
				System.out.println(" 3. Get one dept all employee");
				System.out.println(" 4. Update Employee Salary");
				System.out.println(" 5. Remove one Employee");
				System.out.println(" 6. Remove Dept");
				System.out.println(" 7. Exit");
				
				System.out.println("Enter Option");
				
				int option = scn.nextInt();
				scn.nextInt();
				
				switch(option) {
				
				case 1:{//save employee
					try {
						Employee emp = new Employee();
						
						System.out.println("\n===========Enter Personal Details=========");
						
						System.out.println("Enter Eno:\t\t ");
						emp.setEno(scn.nextInt());
						scn.nextLine();
						
					    System.out.println("Enter EName:\t\t ");
					    emp.setName(scn.nextLine());
					    
					    System.out.println("Enter Dept:\t\t ");
					    emp.setDept(scn.nextLine());
					    
					    System.out.println("Enter Salary:\t\t");
					    emp.setSal(scn.nextDouble());
					     
					    System.out.println("\n============Enter Address Details========== ");
					    System.out.println("Enter Address ");
					    emp.setAddress(scn.nextLine());
					    
					    c.store(emp);
					    System.out.println("\nEmployee is saved ");
					    
					    try {Thread.sleep(1000);}
					    catch(InterruptedException e){}
					    }
					catch(DuplicateEmployeeException e) {
						System.out.println("Error "+e.getMessage());
					}
					break;

				}//close 1 case 
				
			case 2:{
				
			System.out.println("\n Enter eno ");
			int eno = scn.nextInt();
			scn.nextLine();
			
			System.out.println("\n Enter dept ");
			String dept =scn.nextLine();
			
			Employee emp = c.get(eno, dept);
			if(emp == null)
				System.out.println("Error : Employee not found with the given details");
			else {
				System.out.println(emp);
			}
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {
				}
			break;
			}//close case 2
			
			
			case 3:{//get one dept for all employee
				System.out.println("\n Enter dept");
				String dept = scn.nextLine();
				
				Enumeration<Employee>e = c.get(dept);
				if(!e.hasMoreElements()) {
					System.out.println("Error:given dept is not existed ");
				}else {
					do {
						System.out.println(e.nextElement());
					}while(e.hasMoreElements());
				}
				try {Thread.sleep(1000);}
				catch(InterruptedException ex) {}
				break;
			}//close case 3
			
			case 4:{// updating salary
				System.out.println("\n Enter Eno ");
				int eno = scn.nextInt();
				scn.nextLine();
				
				System.out.println("\n Enter dept ");
				String dept = scn.nextLine();
				
				System.out.println("\n Enter hike percentage ");
				int perc = scn.nextInt();
				scn.nextLine();
				try {
					c.updateSal(eno, dept, perc);
					System.out.println("Employee salary is increased ");
				}catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
					
				}
				
				try {Thread.sleep(1000);}
				catch(InterruptedException e) {}
				break;
				}//close case 4
			
			case 5:{// remove one employee
				System.out.println("\n Enter eno ");
				int eno = scn.nextInt();
				scn.nextLine();
				
				System.out.println("\n Enter dept ");
				String dept = scn.nextLine();
				
				Employee emp = c.remove(eno ,dept);
				if(emp==null) {
					System.out.println("Employee is not found with given details");
				}else {
					System.out.println("Employee is removed");
				}
				try {Thread.sleep(1000);}
				catch(InterruptedException e) {}
				break;
			}
			case 6:{//remove dept
				System.out.println("\n Enter eno ");
				String dept = scn.nextLine();
				boolean removed = c.remove(dept);
				if(removed) {
					System.out.println("Dept is removed");
				}else {
					System.out.println("Dept is not found");
				}
				try {Thread.sleep(1000);}
				catch(InterruptedException e) {}
				break;
				}
			case 7:{//exit
				System.out.println("^^^^^^^^^^Thank You:-)^^^^^^^^^^^^^^");
				break loop;
				}
			default:{
				System.out.println("\n Invalid Option");
			}
			}//switch close
		}//While(true)
	}catch(EmployeeClassNotFoundException e) {
		System.out.println("Error "+e.getMessage());
	}
	}

}
