package day1;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
	//	String str="string 1234";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two String : ");
		String str1=sc.next();
		String str2=sc.next();
//		System.out.println("Length of string = "+str.length());
//        System.out.println("Uppercase : "+str.toUpperCase());
//        System.out.println(("Lowercase : "+str.toLowerCase()));
//        System.out.println("1st element of string : "+str.charAt(0));
//        System.out.println("Last element of string : "+str.charAt(str.length()-1));
//        
		if(str1.contains(str2))
			System.out.println("str1 contains str2");
		else
			System.out.println("str1 doesn't contain str2");
		
		
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		
		
		if(str1.equals(str2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		
	}
	}
	


