package com.in28minutes.hardik;

public class Mynumber {
	private int number;

	public Mynumber(int number) {
         this.number = number;
	}

	public boolean isPrime() {
		for (int i=2; i<= number -1; i++) {
			if (number % i == 0) {
				return false;
		}
	}
     	return true;
	}
 
}
