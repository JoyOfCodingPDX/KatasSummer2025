package edu.pdx.cs.joy.pair13;

import com.google.common.annotations.VisibleForTesting;

/**
* A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

	@VisibleForTesting
		public static void main(String[] args) {
			//System.err.println("Missing command line arguments");

			if (args.length == 0) {
				System.err.println("Missing command line arguments");
				return;
			}

			try {
				int year = Integer.parseInt(args[0]);
				if (isLeapYear(year)) {
					System.out.println(year + " is a leap year.");
				} else {
					System.out.println(year + " is not a leap year.");
				}
			} catch (NumberFormatException e) {
				System.err.println("Invalid year: " + args[0]);
			}
		}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		}
		return false;
	}


}
