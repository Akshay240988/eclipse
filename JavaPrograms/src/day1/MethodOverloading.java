package day1;

public class MethodOverloading {
	public void add()
	{
		int a=2,b=2;
		System.out.println("Addition : "+(a+b));
	}
	//1) by changing no. of parameters
	public void add(int c)
	{
		int a=2,b=2;
		System.out.println("Addition : "+(a+b+c));
	}
	//2) by changing type of parameters
	public void add(double c)
	{
		int a=2,b=2;
		System.out.println("Addition : "+(a+b+c));
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add();
		m.add(10);
		m.add(110.10);

	}

}
