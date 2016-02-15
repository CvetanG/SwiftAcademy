package bg.swiftacademy.homework_05;

import java.util.Scanner;

public class Task_01 {

	private static void myMethod (int[] array, int num) {
		boolean equal = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				equal = true;
			}
		}
		System.out.println();
		System.out.println(equal);
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a valid number for array indexes: ");
		int n = input.nextInt();
		System.out.print("Enter a valid number to be checked: ");
		int m = input.nextInt();

		int[] arr = new int[n];

		//Random elements
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = ((int)(Math.random()*100+1));
		}

		//print matrix
		for (int row : arr) {
			System.out.printf("%d ", row);
		}


		myMethod(arr, m);
		input.close();

	}

}


