package day1;

public class SimpleArray {

	public static void main(String[] args) {
		//1st way of array creation
		int arr[]= {1,23,65,78};
		int len=arr.length;
		System.out.println("Length of an array :"+len);
		
		//2nd  way of array creation
		int a[]=new int[3];
		a[0]=56;
		a[1]=23;
		a[2]=789;
		System.out.println("Elements of an array :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Elements of an array in reverse order :");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

}
