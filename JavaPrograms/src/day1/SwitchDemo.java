package day1;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Monday \n 2. Tuesday");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			   System.out.println("Monday");
			   break;
		}
		case 2: {
			   System.out.println("Tuesday");
			   break;
		}
		
		default:
			System.out.println("Invalid input");
			break;
		}
		
	}

}
