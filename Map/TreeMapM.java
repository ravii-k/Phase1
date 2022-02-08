package Map;

import java.util.*;

public class TreeMapM {

	public static void main(String[] args) {
		// Creating TreeMap of even numbers
		TreeMap<String, Integer> evenNumbers = new TreeMap<>();

		// Using put()
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);

		// Using putIfAbsent()
		evenNumbers.putIfAbsent("Six", 6);
		System.out.println("TreeMap of even numbers: " + evenNumbers);

		// Creating TreeMap of numbers
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("One", 1);

		// Using putAll()
		numbers.putAll(evenNumbers);
		System.out.println("TreeMap of numbers: " + numbers);
	}
}