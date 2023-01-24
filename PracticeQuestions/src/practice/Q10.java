package practice;

import java.util.ArrayList;
import java.util.List;

public class Q10 {

	public static void main(String[] args) {
		// Java Program to Join Two Lists
		
		List<String> list1=new ArrayList<String>();  
		List <String> list2=new ArrayList<String>();
		
		list1.add("Prashant");
		list1.add("madhuri");
		list1.add("Rutuja");
		list1.add("shubham");
		list2.add("Keshav");
		list2.add("Akash");
		list2.add("Deblina");
		list1.addAll(list2);
		 for(String name:list1) 
		 {
			    System.out.println(name);  
		 }  
	}

}
