package day1;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		if((a!=0)&&(a>0))
		{
		    if (a%2==0)
		       {
			        System.out.println("It is an even number");
		       }
		    else
		       {
			        System.out.println("It is an odd number");
		       }
        }
		else
		{
			System.out.println("Invalid input.......as entered number is neither even nor odd ");
		}

}
}
