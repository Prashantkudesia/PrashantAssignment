package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {
		
		// Java Program to Convert List (ArrayList) to Array and Vice-Versa
		
		ArrayList a=new ArrayList<>();
		a.add("Prashant");
		a.add("Keshav");
		a.add("Shubham");
		a.add("Rutuja");
		
		System.out.println("ArrayList: " + a);
		
		String arr[]=new String[a.size()];
		a.toArray(arr);
		System.out.print("Array: ");
	    for(String item:arr) {
	      System.out.print(item+", ");
	    }
		
	    System.out.println();
	    ArrayList a1=new ArrayList<>(Arrays.asList(arr));
	    System.out.println("ArrayList: " + a1);
		

	}
}
