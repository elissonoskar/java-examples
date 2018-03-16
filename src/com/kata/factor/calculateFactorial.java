package com.kata.factor;

import java.io.IOException;

public class calculateFactorial {
	public static void main(String[] args) throws IOException {
		System.out.println(factorial(8));
		System.out.println(factorialIterative(8));

	}
	
	//Recursive way of calculating the factor!
	static int factorial(int n){      
        if (n == 1)      
          return 1;      
        else      
          return(n * factorial(n-1));      
  }     
	
	//Iterative way of calculating the factorial
	static int factorialIterative(int n) {
		int result = n;
		for(int i=n-1; i > 1; i--) {
			result = result*(i);
		}
		return result;
	}
}
