package practice;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// Java Program to Find the Frequency of Character in a String
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		
		int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);

	}

}
