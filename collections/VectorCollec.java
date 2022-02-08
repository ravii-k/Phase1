package collections;

import java.util.*;

public class VectorCollec {

	public static void main(String args[]) {
		Vector<String> v = new Vector<String>();
		v.add("Mohan");
		v.add("Rohan");
		v.add("Sohan");
		v.add("Manoj");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}