package practice;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// Java Program to Generate Multiplication Table
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
}
