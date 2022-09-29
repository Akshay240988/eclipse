package day1;

import java.util.Scanner;

public class UserDefinedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int l=sc.nextInt();
		int arr[]=new int[l];
		System.out.println("Enter elements of an array: ");
		for(int i=0; i<=l-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of an array are:");
		for (int i = 0; i<=l-1; i++) {
			System.out.println(arr[i]);
		}
	}
}
