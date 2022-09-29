package day1;

import java.util.Scanner;

public class NestedifDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		
		if(age>=18)//condition 1
		{
			System.out.println("Enter weight: ");
			int wt = sc.nextInt();
			if(wt>=45)//condition 2
			{//condition 1 & 2 = true
				System.out.println("Eligible for donating blood");
			}
			else
			{//condition 2 = false
				System.out.println("Not Eligible......underweight");
			}
		}
		else
		{//condition 1 = false
			System.out.println("Not Eligible.......underage");
		}
		
	}

}
