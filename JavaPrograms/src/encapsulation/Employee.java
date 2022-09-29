package encapsulation;

public class Employee {
	public String name="XYZ";
	String desgn="Tester";
	
	private void calSal(int bsal)
	{
		int da1=1000, da2=500, gsal;
		if(bsal<=5000)
		{
			gsal=bsal+da1;
			System.out.println("Gross salary is : "+gsal );
		}
		else if(bsal>5000 && bsal <=10000)
		{
			gsal=bsal+da2;
			System.out.println("Gross salary is : "+gsal);
		}
		else
		{
			System.out.println("Invalid range");
		}
	}
	
		protected void callSal(int sal)
		{
			calSal(sal);
		}
		
	}
    


