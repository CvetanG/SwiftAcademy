package bg.swiftacademy.homework_03;

import java.util.Scanner;

public class Task_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three digit: ");
		int param = input.nextInt();
		
		if (param <= 999 && param >= 0) {
			int temp = param;
			
			switch (temp / 100) {
			case 0:
				break;
			case 1:
				System.out.print("Сто ");
				break;
			case 2:
				System.out.print("Двеста ");
				break;
			case 3:
				System.out.print("Триста ");
				break;
			case 4:
				System.out.print("Четиристотин ");
				break;
			case 5:
				System.out.print("Петстотин ");
				break;
			case 6:
				System.out.print("Шестстотин ");
				break;
			case 7:
				System.out.print("Седемстотин ");
				break;
			case 8:
				System.out.print("Осемстотин ");
				break;
			case 9:
				System.out.print("Деветстотин ");
				break;

			default:
				System.out.print("Error report!");
				break;
			}
			
//			if (temp / 100 != 0 && temp % 100 != 0) {
//				System.out.print("и ");
//			}
			
			switch (temp / 10 % 10) {
			case 0:
				break;
			case 1: {
				switch (temp % 10) {
				case 0:
					System.out.print("десет ");
					break;
				case 1:
					System.out.print("единайсет ");
					break;
				case 2:
					System.out.print("дванайсет ");
					break;
				case 3:
					System.out.print("тринайсет ");
					break;
				case 4:
					System.out.print("четиранайсет ");
					break;
				case 5:
					System.out.print("петнайсет ");
					break;
				case 6:
					System.out.print("шестнайсет ");
					break;
				case 7:
					System.out.print("седемнайсет ");
					break;
				case 8:
					System.out.print("осемнайсет ");
					break;
				case 9:
					System.out.print("деветнайсет ");
					break;

				default:
					System.out.print("Error report!");
					break;
				}
			}
			break;
			case 2:
				System.out.print("двайсет и ");
				break;
			case 3:
				System.out.print("трийсет и ");
				break;
			case 4:
				System.out.print("четирсет и ");
				break;
			case 5:
				System.out.print("педесет и ");
				break;
			case 6:
				System.out.print("шейсет и ");
				break;
			case 7:
				System.out.print("седемдесет и ");
				break;
			case 8:
				System.out.print("осемдесет и ");
				break;
			case 9:
				System.out.print("деветдесет и ");
				break;

			default:
				System.out.print("Error report!");
				break;
			}
			switch (temp % 10) {
			case 0:
				if (temp == 0) {
					System.out.print("нула");                            
				}
				break;
			case 1:
				if (temp / 10 % 10 == 1) break;
				System.out.print("едно");
				break;
			case 2:
				if (temp / 10 % 10 == 1) break;
				System.out.print("две");
				break;
			case 3:
				if (temp / 10 % 10 == 1) break;
				System.out.print("три ");
				break;
			case 4:
				if (temp / 10 % 10 == 1) break;
				System.out.print("четири");
				break;
			case 5:
				if (temp / 10 % 10 == 1) break;
				System.out.print("пет");
				break;
			case 6:
				if (temp / 10 % 10 == 1) break;
				System.out.print("шест");
				break;
			case 7:
				if (temp / 10 % 10 == 1) break;
				System.out.print("седем ");
				break;
			case 8:
				if (temp / 10 % 10 == 1) break;
				System.out.print("осем ");
				break;
			case 9:
				if (temp / 10 % 10 == 1) break;
				System.out.print("девет ");
				break;

			default:
				System.out.print("Error report!");
				break;
			}
		} else {
			System.out.print(" Out of range! ");
		} 
		input.close();
	}

}
