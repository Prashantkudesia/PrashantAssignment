package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// Java Program to Convert Character to String and Vice-Versa
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		String s=Character.toString(ch);
		System.out.println("Character to string : "+s);

        char[] chars = s.toCharArray();
        System.out.println("String to Character"+Arrays.toString(chars));
		

	}

}
