package practice;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// Java Program to Concatenate Two Arrays
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of first array");
		int n=sc.nextInt();
		System.out.println("Size of second array");
		int m=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		int x=n+m;
		int arr3[]=new int[x];
		System.out.println("Element of First array");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Element of second array");
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int pos = 0;
        for (int element : arr1) {
            arr3[pos] = element;
            pos++;
        }

        for (int element : arr2) {
            arr3[pos] = element;
            pos++;
        }
        System.out.println("Elements of concatenated array");
		for(int e:arr3)
		{
			System.out.print(e+" ");
		}

	}

}
