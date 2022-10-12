import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Number1: ");
			int number1 = scanner.nextInt();
			System.out.print("Enter Number2: ");
			int number2 = scanner.nextInt();
			
			System.out.println("Select The Operation Choice:");
			System.out.println("1- Add");
		    System.out.println("2- Substraction");
		    System.out.println("3- Multiplication:");
		    System.out.println("4- Divide:");
		    System.out.print("Enter Your Choice: ");
		    int choice = scanner.nextInt();
		    
		    if (choice == 1) {
		    	System.out.println("Result = " + (number1 + number2));
		    } else if (choice == 2) {
		    	System.out.println("Result = " + (number1 - number2));
		    }  else if (choice == 3) {
		    	System.out.println("Result = " + (number1 * number2));
		    }  else if (choice == 4) {
		    	System.out.println("Result = " + (number1 / number2));
		    }  else {
		    	System.out.println("Invalid Operation");
		    }
		    
	} 

}
