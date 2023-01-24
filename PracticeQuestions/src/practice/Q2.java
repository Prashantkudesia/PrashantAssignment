package practice;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		//Display Fibonacci Series//
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		
		System.out.print("Fibonacci series: "+n1+" "+n2+" ");
		int temp;
		for(int i=2;i<n;i++)
		{
			temp=n1+n2;
			n1=n2;
			n2=temp;
			System.out.print(temp+" ");
		}

	}

}
