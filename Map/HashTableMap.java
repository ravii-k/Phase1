package Map;

import java.util.*;

public class HashTableMap {

	public static void main(String[] args) {
		{
			Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

			ht.put(4, "ravi");
			ht.put(5,"kashish");
			ht.put(6, "vinit");
			ht.put(7, "kashyap");

			ht.remove(12);

			System.out.println(ht);
		}
	}
}