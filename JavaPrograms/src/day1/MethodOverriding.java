package day1;

class Vehicle
{
	public void run() 
	{
		System.out.println("All vehicles should run");
	}
}
class Bike extends Vehicle
{
	public void run() 
	{
	    System.out.println("Bike is running");	
	}
}


public class MethodOverriding {
	

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
		

	}

}
