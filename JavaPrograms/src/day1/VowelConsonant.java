package day1;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.next();
		String str1=str.toLowerCase();
		int v=0,x=0;
		
//		char c = str.charAt(0);
//		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//			System.out.println("1st character is vowel");
//		else
//			System.out.println("1st character is consonant");
//		
		for (int i = 0; i <=str.length()-1; i++) {
			char c = str1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				v++;
			}
			else
			{
				x++;
			}
		}
		System.out.println("number of vowels in the string : "+v);
		System.out.println("number of consonant in the string : "+x);
	}

}
