package bg.swiftacademy.homework_05;

import java.util.Scanner;

public class Task_02 {
	
	
	private static void reverse(int num){
		int c = num%10;
		int b = (num/10)%10;
		int a = (num/100)%10;
		System.out.printf("%d%d%d", c, b, a);
		
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number abc: ");
		int abc = input.nextInt();
		
		reverse(abc);
		
		input.close();
	}

}
