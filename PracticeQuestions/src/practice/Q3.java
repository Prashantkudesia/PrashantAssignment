package practice;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		//Check Whether a string is Palindrome or Not//
		
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
		{
			System.out.println(s+" is Palindrome");
		}
		else
		{
			System.out.println(s+" is not Palindrome");
		}
	}

}
