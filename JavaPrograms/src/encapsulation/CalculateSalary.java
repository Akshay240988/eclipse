package encapsulation;

import java.util.Scanner;

public class CalculateSalary extends Employee{

	public static void main(String[] args) {
		
          CalculateSalary c = new CalculateSalary();
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Employee name : "+c.name);
          System.out.println("Employee designation : "+c.desgn);
          
          System.out.println("Enter the basic salary :");
          int bsal = sc.nextInt();
          c.callSal(bsal);
	}

}
