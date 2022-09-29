package day1;

public class methodDemo {
    int a;
	public void add()
	{
		a=10;
		int b=4;//local variable
		System.out.println("Addition : "+(a+b));
	}
	
	public void sub(int b)//parameterized method and variable 
	{
		a=8;
		System.out.println("Subtraction : "+(a-b));
		
	}
	
	public int multi() 
	{
		a=6;
		int b=4;
		return a*b;
	}
	public int div( int b) 
	{ 
		a=4;
		return (a/b);
	}
	public static void main(String[] args) {
		
		methodDemo m = new methodDemo();//object creation and initialization
		m.add();
		m.sub(2);
		int d=m.div(2);
		System.out.println("Division : "+d);
		System.out.println("Multiplication : "+m.multi());
	}

}
