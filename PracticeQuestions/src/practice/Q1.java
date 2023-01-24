package practice;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		//Check Whether a Number is Prime or Not//
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		if(n==1)
		{
			System.out.println(n+" is Neither prime nor composite.");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(n+" is prime.");
			}
			else
			{
				System.out.println(n+" is not a prime.");
			}
		}
	}
}
