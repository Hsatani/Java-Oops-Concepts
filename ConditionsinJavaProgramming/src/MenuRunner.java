

import java.util.Scanner;

     public class MenuRunner{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = Scanner.nextInt();
		System.out.print("Enter Number2: ");
		int number2 = Scanner.nextInt();

		System.out.println("Select The Operation Choice");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		System.out.print("Enter Choice: ");
		int choice = Scanner.nextInt();

		System.out.print("Your Inputs Are:");
		System.out.println("Number1: " + number1);
		System.out.println("Number2: " + number2);
		System.out.println("Choice: " + choice);
	}
}

