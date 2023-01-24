package practice;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// Java Program to Check if An Array Contains a Given Value
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Element to be searched:");
		int a=sc.nextInt();
		int c=0;
		for(int element:arr)
		{
			if(element==a)
			{
				c++;
			}
		}
		if(c>0)
		{
			System.out.println("Element is present in array");
		}
		else
		{
			System.out.println("Element is not present in array");
		}

	}

}
