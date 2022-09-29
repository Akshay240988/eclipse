package Interface;

import java.util.Scanner;

public class Square implements Shape{

	public static void main(String[] args) {
		Square sq = new Square();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square : ");
		int s=sc.nextInt();
		sq.area(s);

	}

	@Override
	public void area(int s) {
		System.out.println("Area of square : "+(s*s));
	}

}
