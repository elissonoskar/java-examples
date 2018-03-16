package com.kata.armstrong;

import java.io.IOException;

public class ArmstrongChecker {

	public static void main(String args[]) throws IOException {
		// int test = 777;
		// System.out.println("Is this a Armstrong Numer? " + test +
		// checkIfNumberIsArmstrong(test));
		printAllArmstrongNumbers(67988);

	}

	public static void printAllArmstrongNumbers(int maxIntToCheck) {
		System.out.println("maxIntToCheck is" + maxIntToCheck);
		for (int i = 0; i < maxIntToCheck; i++) {
			if (checkIfNumberIsArmstrong(i)) {
				System.out.println(i + " ");
			}
		}
	}

	public static boolean checkIfNumberIsArmstrong(int number) {
		int length = String.valueOf(number).length();
		String stringNumber = Integer.toString(number);
		int j = 0;
		int sum = 0;
		if (number == 1) {
			return true;
		} else if (number > 1 && number < 10) {
			return false;
		} else {
			for (int i = 0; i < length; i++) {
				j = Integer.parseInt(stringNumber.substring(i, i + 1));
				Double d = Math.pow(j, length);
				int k = d.intValue();
				sum = sum + k;
			}
		}
		// System.out.println(sum);
		if (sum == number)

		{
			return true;
		}

		return false;
	}

}
