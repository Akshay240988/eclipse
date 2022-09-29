package day1;

import java.util.Scanner;

public class SwitchArithmetic {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" 1-Addition \n 2-Subtraction \n 3-Multiplication \n 4-Division");
		System.out.println("Select operation - ");
		int ch = sc.nextInt();
		System.out.println("Enter value for variable a: ");
		int a=sc.nextInt();
		System.out.println("Enter value for variable b: ");
		int b=sc.nextInt();
		
		switch (ch) {
		case 1: {
			System.out.println("Addition = "+(a+b));
			break;
		}
		case 2: {
			System.out.println("Subtraction = "+(a-b));
			break;
		}
		case 3:{
			System.out.println("Multiplication = "+(a*b));
			break;
		}
		case 4:{
			System.out.println("Division = "+(a/b));
			break;
		}	
		default:{
			System.out.println("Invalid input....");
			break;
		}
		}
	}

}
