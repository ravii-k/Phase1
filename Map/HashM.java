package Map;

import java.util.*;

public class HashM {

	public static void main(String[] args) {
		// create a hashmap
		HashMap<String, Integer> languages = new HashMap<>();

		// add elements to hashmap
		languages.put("Java", 8);
		languages.put("Cpp", 1);
		languages.put("Python", 3);
		System.out.println("HashMap: " + languages);
	}
}