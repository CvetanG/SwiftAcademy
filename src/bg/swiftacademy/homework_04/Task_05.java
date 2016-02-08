package bg.swiftacademy.homework_04;

import java.util.Scanner;

public class Task_05 {

	public static void main(String[] args) {

		//enter length
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a valid number for rows: ");
		int n = in.nextInt();
		System.out.print("Enter a valid number for cols: ");
		int m = in.nextInt();

		int [][] myArray = new int[n][m];

		//Random elements
		for (int i = 0 ; i < myArray.length ; i++) {
			for (int j = 0 ; j < myArray[i].length ; j++) {
				myArray[i][j] = ((int)(Math.random()*100+1));
			}
		}

		//print matrix
		for (int[] row : myArray) {
			for (int value : row) {
				System.out.printf("%d ", value);
			}
			System.out.println();
		}

		double sum = 0;

		for (int i= 0;  i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				sum += myArray[i][j];
			}
		}
		System.out.println();
//		System.out.println(sum);
		System.out.println("The average number is: " + sum/(n*m));
		
		int big = 0;
		
		for (int i= 0;  i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				if (big < myArray[i][j]) {
					big = myArray[i][j];
				} else {
					continue;
				}
			}
		}
		System.out.println("Max. element is: " + big);
		

		in.close();
	}

}
