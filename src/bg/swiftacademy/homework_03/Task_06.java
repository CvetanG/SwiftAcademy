package bg.swiftacademy.homework_03;

import java.util.Scanner;

public class Task_06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("�������� ����� �� 0 �� 9: ");
		int a = input.nextInt();

		switch (a) {
		case 0:
			System.out.print("����");
			break;
		case 1:
			System.out.print("����");
			break;
		case 2:
			System.out.print("���");
			break;
		case 3:
			System.out.print("���");
			break;
		case 4:
			System.out.print("������");
			break;
		case 5:
			System.out.print("���");
			break;
		case 6:
			System.out.print("����");
			break;
		case 7:
			System.out.print("�����");
			break;
		case 8:
			System.out.print("����");
			break;
		case 9:
			System.out.print("�����");
			break;

		default:
			System.out.println("�������� � ������ ��������!");
			break;
		}
		
		input.close();
	}
}
