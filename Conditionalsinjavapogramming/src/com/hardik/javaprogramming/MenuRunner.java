package com.hardik.javaprogramming;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();
		
		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();
	
		System.out.println("Choices available are");
		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		
		System.out.print("Enter Choice: ");
		int Choice = scanner.nextInt();

		System.out.println("Your choice are");
		System.out.println("Number1-" + number1);
		System.out.println("Number2-" + number2);
		System.out.println("Choice-"+ Choice);
		
		if (Choice ==1) {
			System.out.println("The Result"+(number1+number2));
		}  else if (Choice == 2) {
			System.out.println("The Result"+(number1-number2));
		}  else if (Choice ==3) {
			System.out.println("The Result"+(number1/number2));
		}  else if (Choice ==4) {
			System.out.println("The Result"+(number1*number2));
	
		}
	}
}