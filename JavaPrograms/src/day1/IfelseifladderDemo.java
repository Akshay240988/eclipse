package day1;

import java.util.Scanner;

public class IfelseifladderDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(n>=0 && n<=9)
			System.out.println("Entered number is one digit number");
		else if(n>=10 && n<=99 )
			System.out.println("Entered number is two digit number");
		else if(n>=100 && n<=999)
			System.out.println("Entered number is three digit number");
		else
			System.out.println("Invalid number");
		
	}

}
