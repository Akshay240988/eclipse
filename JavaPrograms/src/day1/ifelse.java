package day1;

import java.util.Scanner;

public class ifelse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter age: ");
		int a = sc.nextInt();
		
		if(a>18) 
		{
			//body of if block//condition=true
			System.out.println("Eligible of getting license");
		}
		else {////condition=false
			System.out.println("Underage...");
		}
	}

}
