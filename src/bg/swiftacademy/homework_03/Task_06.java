package bg.swiftacademy.homework_03;

import java.util.Scanner;

public class Task_06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Въведете цифра от 0 до 9: ");
		int a = input.nextInt();

		switch (a) {
		case 0:
			System.out.print("Нула");
			break;
		case 1:
			System.out.print("Едно");
			break;
		case 2:
			System.out.print("Две");
			break;
		case 3:
			System.out.print("Три");
			break;
		case 4:
			System.out.print("Четири");
			break;
		case 5:
			System.out.print("Пет");
			break;
		case 6:
			System.out.print("Шест");
			break;
		case 7:
			System.out.print("Седем");
			break;
		case 8:
			System.out.print("Осем");
			break;
		case 9:
			System.out.print("Девет");
			break;

		default:
			System.out.println("Въведена е грешна стойност!");
			break;
		}
		
		input.close();
	}
}
