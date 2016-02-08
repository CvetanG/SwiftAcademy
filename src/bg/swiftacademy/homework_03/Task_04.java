package bg.swiftacademy.homework_03;

import java.util.Scanner;

public class Task_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a = : ");
		int a = input.nextInt();
		System.out.print("Enter b = : ");
		int b = input.nextInt();
		System.out.print("Enter c = : ");
		int c = input.nextInt();
		
		if (a > b) {
			if (a > c) {
				System.out.println("The biggest number is: " + a);
			} else {
				System.out.println("The biggest number is: " + c);
			}
		} else {
			if (b > c) {
				System.out.println("The biggest number is: " + b);
			} else {
				System.out.println("The biggest number is: " + c);
			}
		}
		
		input.close();
	}

}
