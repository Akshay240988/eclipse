package day1;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pin=1234;
		int i=1;
		while(i<=3) {
			
			System.out.println("Enter password");
			int p =sc.nextInt();
		
		    if(pin==p) {
			   System.out.println("Access granted");
			   break;
		    }
		    else {
			   System.out.println("Access Denied");
		    }
		    i++;
	     }
    }
}
