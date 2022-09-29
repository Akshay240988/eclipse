package day1;

public class CPUExecution {

	public static void main(String[] args) {
		
		
		//MonitorObject.brand="AOC";
		//MonitorObject m1 = new MonitorObject();
		MonitorObject.brand="AOC";
		MonitorObject.price=5000;
		MonitorObject.size=21;
		MonitorObject.type="LCD";
		MonitorObject.display();
		System.out.println("--------------------------------------------");
		//MonitorObject m2 = new MonitorObject();
		MonitorObject.brand="HP";
		MonitorObject.price=7000;
		MonitorObject.size=18;
		MonitorObject.type="LED";
		MonitorObject.display();
	}

}
