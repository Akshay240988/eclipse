package day1;

import java.util.Scanner;

import encapsulation.EncapDemo;

public class FirstProg {

	public static void main(String[] args) {
////		System.out.println("hello");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter value for variable a: ");
		
		int a=sc.nextInt();
		
		System.out.println("Enter value for variable b: ");
		int b=sc.nextInt();
				
		System.out.println("Addition = "+(a+b));
		
		try
		{
			System.out.println("Division = "+(a/b));	
		}
		catch (Exception e) 
		{
			System.out.println("ERROR MSG : "+e.getMessage());
		}
		
		System.out.println("Subtraction = "+(a-b));
		System.out.println("Multiplication = "+(a*b));	
      	
//		
//		EncapDemo e = new EncapDemo();
//		System.out.println(e.name);
//		FirstProg f = new FirstProg();
//	    System.out.println(f.EmpId);
//	    System.out.println(sal);
//		
//		
		
	

	}

}
