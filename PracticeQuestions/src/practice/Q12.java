package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Q12 {

	public static void main(String[] args) {
		// Java Program to Convert Map (HashMap) to List
		
				HashMap<String, String> map= new HashMap<>();

				// Add elements to the map
				map.put("Prashant","Agra");
				map.put("Ram", "Pune");
				map.put("Aviral","Aligarh");

				// Finding the Set of keys from
				// the HashMap
				Set<String> keySet = map.keySet();

				// Creating an ArrayList of keys
				// by passing the keySet
				ArrayList<String> listOfKeys= new ArrayList<String>(keySet);

				// Getting Collection of values from HashMap
				Collection<String> values = map.values();

				// Creating an ArrayList of values
				ArrayList<String> listOfValues= new ArrayList<>(values);

				System.out.println("The Keys of the Map are "+ listOfKeys);
				System.out.println("The Values of the Map are "+ listOfValues);
			}
}
