package queue;

import java.util.*;

public class RemoveElementQueue {
	public static void main(String[] args) {
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Meerut");
		locationsQueue.add("Delhi");
		locationsQueue.add("Muzaffarnagr");
		locationsQueue.add("noida");
		locationsQueue.add("Gurgaon");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}
}
