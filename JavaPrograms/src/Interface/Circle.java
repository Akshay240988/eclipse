package Interface;

import java.util.Scanner;

public class Circle implements Shape
{
   public static void main(String[] args) 
   {
	Circle c = new Circle();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle : ");
	int r=sc.nextInt();
	c.area(r);
	   
   }
	
	@Override
	public void area(int r) {
		System.out.println("Area of circle : "+(3.15*r*r));
		
	}
	
}


