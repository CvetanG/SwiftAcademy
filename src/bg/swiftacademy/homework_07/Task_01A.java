package bg.swiftacademy.homework_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_01A {
	
	public static void myFloat() {
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a valid float number: ");
			float n = input.nextFloat();
			
			System.out.println("Your float is: " + n);
			input.close();
		} catch (InputMismatchException ime) {
			ime.getCause();
			System.out.println("Your element is not a float. "
					+ "Please try again!");
			myFloat();
		}
	}	
		
	public static void main(String[] args) {
		myFloat();
	}

}
