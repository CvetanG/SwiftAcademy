package bg.swiftacademy.homework_04;

import java.util.Scanner;

public class Task_07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.next();
		
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] wArray = word.toCharArray();
		
		for (int i = 0; i < wArray.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (wArray[i] == alphabet[j]) {
					System.out.println(wArray[i] + " " + j);
				}
			}
			
		}
		
		input.close();
	}

}
