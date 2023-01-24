package practice;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// Java Program to Check Whether a Character is Alphabet or Not
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if((ch>= 97 && ch<=122) || (ch>=65 && ch<=90))
		{
			System.out.println(ch+" is a Alphabet");
		}
		else
		{
			System.out.println(ch+" is a not a Alphabet");
		}

	}

}
