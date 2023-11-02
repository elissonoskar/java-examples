package com.kata.prime;

public class PrimeChecker {

	public boolean checkIfPrime(int n) {
		// checks whether an int is prime or not.
		// check if n is a multiple of 2
		if (n=2){
			return true;
		}
		else if (n % 2 == 0) {
			return false;
		}
		// if not, then check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
