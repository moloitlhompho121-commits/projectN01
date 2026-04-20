/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
    nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java                                                                             to change this license
 */
package com.mycompany.employeepayrollsystem;

import java.util.Scanner;


/**
 *
 * @author Student
 */


 
public class EmployeePayrollSystem {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int employeeId=0;
        int hourlyRate=0;
        int hoursWorked=0;
        double initialSalay;
        double bonus=0;
        int details=0;
        int view=0;
        int exit =3;
        String employeeName="";
        String status = null;
        int i=0;
        System.out.println("Enter 1: To Enter Employee Details.");             
        System.out.println("Enter 2: To view Employee");       
        System.out.println("Enter 3: To Exit");
        details= input.nextInt();
        
        if (details == 1){
            double initialSalary=0.0;
            
        System.out.println("Enter employee Name: ");
        employeeName = input.nextLine();
        
                
        System.out.println("Enter employee ID: ");
        employeeId =input.nextInt();
        
        
        System.out.println("Enter hourly rate: ");
        hourlyRate =input.nextInt();
        
        
        System.out.println("Enter hour worked: ");
        hoursWorked = input.nextInt();
        
        System.out.println("Enter Work Status whether Part_time or Full_time.");
        status =input.nextLine();
        
        initialSalary = hourlyRate *hoursWorked;
        bonus =initialSalary * 0.1;
        
        }
        else if (status =="Part_time"){
        double initialSalary=0.0;
           initialSalary = hourlyRate *hoursWorked;
           bonus =initialSalary * 0.5;
        }
        else if (details == 2){
            double initialSalary=0.0;
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee work status: "+status);
          
        System.out.println("Employee Base Salary: "+initialSalary);
        
   
        }else if(details ==3){
            System.out.println("Goodbye!");
            System.exit(0);
        }    
        
        
    }
}
