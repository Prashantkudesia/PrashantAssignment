package practice;

import java.util.Scanner;

public class Q24 {
	
	
	 public static String reverse(String sentence) {
		    if (sentence.isEmpty())
		      return sentence;

		    return reverse(sentence.substring(1)) + sentence.charAt(0);

		}

	public static void main(String[] args) {
		// Java Program to Reverse a Sentence Using Recursion
		Scanner sc=new Scanner(System.in);
		String sentence = sc.nextLine();
	    String reversed = reverse(sentence);
	    System.out.println("The reversed sentence is: " + reversed);
	  }

	 

}
