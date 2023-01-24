package practice;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		//Java Program to Calculate Average Using Arrays//
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		float avg=(float)sum/n;
		System.out.println("Average of array is "+avg);
	}

}
