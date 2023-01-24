package practice;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// Java Program to Swap Two Numbers
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a= sc.nextInt();
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		System.out.println("Numbers before swapping: a="+a+" b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Numbers After swapping: a="+a+" b="+b);

	}

}
