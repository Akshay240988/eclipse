package day1;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of an array :");
		int l=sc.nextInt();
		int arr[]=new int[l];
		System.out.println("Enter elements of an array :");
		for(int i=0;i<=l-1;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<=l-1;i++) {
			sum=sum+arr[i];
		}
        System.out.println("Sum of all the elements of array : "+sum);
	}

}
 