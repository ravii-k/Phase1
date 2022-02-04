package com.typeCasting;

public class Main {

	public static void main(String[] args) {
// there are two type casting:-
		// 1.Implicit(automatic type conversion),
		// 2.Explicit Type casting.

		System.out.println("Implicit Type Casting;-");
		int num = 200;  
		long l = num;
		float f = l;
		System.out.println("float value is " + num);
		System.out.println("long value is " + l);
		System.out.println("long value is " + f);

		// 2.Explicit Type casting.
	
		System.out.println("Explicit Type Casting:-");
		
		double d = 100.4;
		long l1 = (long) d;
		int i = (int) l1;    
		System.out.println("value in double is: "+d);
		System.out.println("value in long is: "+l1);
		System.out.println("value in int is: "+i);

	}

}

