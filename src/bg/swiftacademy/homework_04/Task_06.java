package bg.swiftacademy.homework_04;

import java.util.Scanner;

public class Task_06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number abc: ");
		int abc = input.nextInt();
		
		int c = abc%10;
		int b = (abc/10)%10;
		int a = (abc/100)%10;
//		System.out.println(c);
//		System.out.println(b);
//		System.out.println(a);
		System.out.println("cba: " + c + b + a);
		
		input.close();
	}

}
