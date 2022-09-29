package day1;

import java.util.Scanner;

public class SecondProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks of English");
		int a = sc.nextInt();
		System.out.println("Enter the marks of Science");
		int b = sc.nextInt();
		System.out.println("Enter the marks of Maths");
		int c = sc.nextInt();
		
		int total=a+b+c;
		float per=total/3;
		System.out.println("Percentage :"+per);

	}

}
