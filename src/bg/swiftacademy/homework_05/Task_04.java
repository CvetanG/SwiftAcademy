package bg.swiftacademy.homework_05;

import java.util.Scanner;

public class Task_04 {

	private static void BubbleSort(int[] array) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable
		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) { // change to > for ascending sort
					temp = array[j]; // swap elements
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
		
		//print sorted array
		System.out.println();
		for (int row : array) {
			System.out.printf("%d ", row);
		}
	}

	private static void BubbleSort(int[] array, String str){
		if (str.equals("down")) {
			int j;
			boolean flag = true; 
			int temp; 
			while (flag) {
				flag = false; 
				for (j = 0; j < array.length - 1; j++) {
					if (array[j] < array[j + 1]) { 
						temp = array[j]; 
						array[j] = array[j + 1];
						array[j + 1] = temp;
						flag = true; 
					}
				}
			}
			
			//print sorted array
			System.out.println();
			for (int row : array) {
				System.out.printf("%d ", row);
			}
			
		} else if (str.equals("up")) {
			int j;
			boolean flag = true; // set flag to true to begin first pass
			int temp; // holding variable
			while (flag) {
				flag = false; // set flag to false awaiting a possible swap
				for (j = 0; j < array.length - 1; j++) {
					if (array[j] > array[j + 1]) { // change to > for ascending sort
						temp = array[j]; // swap elements
						array[j] = array[j + 1];
						array[j + 1] = temp;
						flag = true; // shows a swap occurred
					}
				}
			}
			
			//print sorted array
			System.out.println();
			for (int row : array) {
				System.out.printf("%d ", row);
			}
			
		} else {
			System.out.println("Error in Sorting Method");
		}
	}


	public static void main(String[] args) {

		//enter length
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a valid number for array indexes: ");
		int n = input.nextInt();

		int [] myArray = new int[n];

		//Random elements
		for (int i = 0 ; i < myArray.length ; i++) {
			myArray[i] = ((int)(Math.random()*100+1));
		}

		//print matrix
		for (int row : myArray) {
			System.out.printf("%d ", row);
		}

//		BubbleSort(myArray);
		
		String up = "up";
		String down = "down";

		BubbleSort(myArray, up);
		BubbleSort(myArray, down);
		input.close();
	}

}
