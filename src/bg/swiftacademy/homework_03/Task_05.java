package bg.swiftacademy.homework_03;

import java.util.Scanner;

public class Task_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("N = ");
		int n = input.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.print(a + " ");
		
		do {
			c = a + b;
			a = b;
			b = c;
			System.out.print(a + " ");
		} while(c < n);
		
		input.close();
	}

}
