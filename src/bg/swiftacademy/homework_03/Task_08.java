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
				System.out.print("��� ");
				break;
			case 2:
				System.out.print("������ ");
				break;
			case 3:
				System.out.print("������ ");
				break;
			case 4:
				System.out.print("������������ ");
				break;
			case 5:
				System.out.print("��������� ");
				break;
			case 6:
				System.out.print("���������� ");
				break;
			case 7:
				System.out.print("����������� ");
				break;
			case 8:
				System.out.print("���������� ");
				break;
			case 9:
				System.out.print("����������� ");
				break;

			default:
				System.out.print("Error report!");
				break;
			}
			
//			if (temp / 100 != 0 && temp % 100 != 0) {
//				System.out.print("� ");
//			}
			
			switch (temp / 10 % 10) {
			case 0:
				break;
			case 1: {
				switch (temp % 10) {
				case 0:
					System.out.print("����� ");
					break;
				case 1:
					System.out.print("��������� ");
					break;
				case 2:
					System.out.print("��������� ");
					break;
				case 3:
					System.out.print("��������� ");
					break;
				case 4:
					System.out.print("������������ ");
					break;
				case 5:
					System.out.print("��������� ");
					break;
				case 6:
					System.out.print("���������� ");
					break;
				case 7:
					System.out.print("����������� ");
					break;
				case 8:
					System.out.print("���������� ");
					break;
				case 9:
					System.out.print("����������� ");
					break;

				default:
					System.out.print("Error report!");
					break;
				}
			}
			break;
			case 2:
				System.out.print("������� � ");
				break;
			case 3:
				System.out.print("������� � ");
				break;
			case 4:
				System.out.print("�������� � ");
				break;
			case 5:
				System.out.print("������� � ");
				break;
			case 6:
				System.out.print("������ � ");
				break;
			case 7:
				System.out.print("���������� � ");
				break;
			case 8:
				System.out.print("��������� � ");
				break;
			case 9:
				System.out.print("���������� � ");
				break;

			default:
				System.out.print("Error report!");
				break;
			}
			switch (temp % 10) {
			case 0:
				if (temp == 0) {
					System.out.print("����");                            
				}
				break;
			case 1:
				if (temp / 10 % 10 == 1) break;
				System.out.print("����");
				break;
			case 2:
				if (temp / 10 % 10 == 1) break;
				System.out.print("���");
				break;
			case 3:
				if (temp / 10 % 10 == 1) break;
				System.out.print("��� ");
				break;
			case 4:
				if (temp / 10 % 10 == 1) break;
				System.out.print("������");
				break;
			case 5:
				if (temp / 10 % 10 == 1) break;
				System.out.print("���");
				break;
			case 6:
				if (temp / 10 % 10 == 1) break;
				System.out.print("����");
				break;
			case 7:
				if (temp / 10 % 10 == 1) break;
				System.out.print("����� ");
				break;
			case 8:
				if (temp / 10 % 10 == 1) break;
				System.out.print("���� ");
				break;
			case 9:
				if (temp / 10 % 10 == 1) break;
				System.out.print("����� ");
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
