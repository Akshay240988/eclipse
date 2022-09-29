package Interface;

public class InterfaceChild1 implements InterfaceDemo
{

	public static void main(String[] args) {
		InterfaceChild1 i = new InterfaceChild1();
		i.demo1();
		i.demo2();
		i.demo3();
		i.demo4();
		int b= InterfaceChild1.a;
		System.out.println(b*2);
		

	}

	@Override
	public void demo1() {
		System.out.println("demo1 method");
		
	}

	@Override
	public void demo2() {
		System.out.println("demo2 method");
		
	}

	@Override
	public void demo3() {
		System.out.println("demo3 method");
		
	}
	
	public void demo4() {
		System.out.println("demo 4 is child specific method");
	}

}
