package com.devcru.fizzbuzz;

// This is if you wanted to decouple the business logic away from the Controller (MainActivity) into a separate class.

public class FizzBuzz {

	public static CharSequence fbPrint(int x) {

		/*
		 * Because this is in its own class, we do not have access to the
		 * setText or append methods. Therefore, we must keep a running list of
		 * the output by storing the values in a variable (print).
		 */

		String print = "";

		if ((x > 0) && (x < 1000)) {
			for (int i = 1; i <= x; i++) {
				if (i % 15 == 0) {
					print += "FizzBuzz\n";
				} else if (i % 3 == 0) {
					print += "Fizz\n";
				} else if (i % 5 == 0) {
					print += "Buzz\n";
				} else
					print += i + "\n";
			}
			return print;
		} else
			return "Please enter a number between 1 and 999!";

	}

}
