package bg.swiftacademy.homework_05;

import java.util.Scanner;

public class Dog {
	
	static int dogCount;
	private static String name; // MyDog-N
	
	private Dog(String name) {
		Dog.name = name;
		dogCount += 1; // Modify the value in the constructor
		bark();
	}
	
	private static void check(int num){
		System.out.println("dogCount = " + dogCount);
		if (dogCount == num) {
			System.out.println("Even");
		} else {
			System.out.println("NOT Even");
			
		}
	}
	
	private static void bark(){
		System.out.printf("%s is barking very loud%n", name);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insert number of dogs: ");
		int n = input.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			Dog myDog = new Dog("Mydog-" + i);
		}
		
		check(n);
		input.close();
	}


}
