package encapsulation;

public class EncapDemo {
	public String name = "XYZ";
	String dept = "IT";
	protected String EmpId="A2127";
	private String Addr="Thane";
	private int sal=40000;
	
	public void getSal() 
	{
      System.out.println("Basic salary is : "+sal);		
	}
     

	
	public static void main(String[] args) {
		EncapDemo e = new EncapDemo();
		System.out.println(e.name);
		System.out.println(e.dept);
		System.out.println(e.EmpId);
		System.out.println(e.Addr);
		System.out.println(e.sal);
	}
}
class Salary{
	
}
