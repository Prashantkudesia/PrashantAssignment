package practice;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// Java Code To Create Pyramid and Pattern
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int k = 0;

	    for (int i = 1; i <= row; ++i, k = 0) 
	    {
	      for (int space = 1; space <= row - i; ++space) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }

	}

}
