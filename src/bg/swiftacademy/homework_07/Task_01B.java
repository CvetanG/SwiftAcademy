package bg.swiftacademy.homework_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_01B {

	public static void myFloat() {

		try {
			Scanner input = new Scanner(System.in);
			input.close();
			System.out.print("Enter a valid float number: ");

			float n = input.nextFloat();
			System.out.println("Your float is: " + n);
		} catch (InputMismatchException ime) {
			ime.getCause();
			System.out.println("Your element is not a float. " + "Please try again!");
			myFloat();
		} catch (IllegalStateException ise) {
			ise.getMessage();
			System.out.println();
			System.out.println("In Code Error! The Scanner is close! "
					+ "Check your code");
		}
	}

	public static void main(String[] args) {
		myFloat();
	}

}
