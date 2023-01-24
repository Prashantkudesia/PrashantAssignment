package practice;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// Java Program to Find Largest Element of an Array
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println("Largest Element of array: "+ arr[n-1]);

	}

}
