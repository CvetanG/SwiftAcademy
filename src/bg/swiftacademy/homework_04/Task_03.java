package bg.swiftacademy.homework_04;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {

		//enter length
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a valid number for rows: ");
		int n = input.nextInt();

		int [][] myArray = new int[n][n];

		//input the matrix element from console
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = input.nextInt();
			}
		}

//		//Random elements
//		for (int i = 0 ; i < myArray.length ; i++) {
//			for (int j = 0 ; j < myArray[i].length ; j++) {
//				myArray[i][j] = ((int)(Math.random()*10));
//			}
//		}

		//print matrix
		for (int[] row : myArray) {
			for (int value : row) {
				System.out.printf("%d ", value);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//diagonal_1
		System.out.println("Diagonal 1:");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				if (i == j) {
					System.out.print(myArray[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		//diagonal_2
		System.out.println("Diagonal 2:");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				if (i + j == n - 1) {
					System.out.print(myArray[i][j] + " ");
				}
			}
		}


		System.out.println();
		//center
		System.out.println("Center:");
		if (n % 2 !=0 ) {
			for (int i = 0; i < myArray.length; i++) {
				for (int j = 0; j < myArray[i].length; j++) {
					if ((i + j == n - 1) && (i == j)) {
						System.out.print(myArray[i][j] + " ");
					} 
				} 
			}
		} else {
			for (int i = ((n / 2) - 1); i < ((n / 2) + 1); i++) {
				for (int j = ((n / 2) - 1); j < ((n / 2) + 1); j++) {
					System.out.print(myArray[i][j] + " ");
				}
			}
		}

		input.close();
	}

}
