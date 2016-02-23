package bg.swiftacademy.homework_06_1;

import java.util.Random;

public class Main {
	
	final static String[] MY_SHAPES = { "Circle", "Rectangle", "Square" };
	private static Random rnd = new Random();
	
	public static void main (String[] args) {
		
		String[] shapes = new String[10];
		
		for (int i = 0; i < shapes.length; i++) {
			int randomIndex = rnd.nextInt(MY_SHAPES.length);
			shapes[i] = MY_SHAPES[randomIndex];
		}
		
		for (String string : shapes) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println();
		
		for (String string : shapes) {
			if (string.equals("Circle")){
				Circle circle = new Circle();
				circle.calculateSurface();
				circle.calculateCircumference();
				System.out.println();
			} else if (string.equals("Rectangle")){
				Rectangle rect = new Rectangle();
				rect.calculateSurface();
				rect.calculateCircumference();
				System.out.println();
			} else if (string.equals("Square")){
				Square sq = new Square();
				sq.calculateSurface();
				sq.calculateCircumference();
				System.out.println();
			} else {
				System.out.println("Error");
			}
		}
		
		
		
//		Circle circle = new Circle();
//		circle.calculateSurface();
//		circle.calculateCircumference();
//		
//		Rectangle rect = new Rectangle();
//		rect.calculateSurface();
//		rect.calculateCircumference();
//		
//		Square sq = new Square();
//		sq.calculateSurface();
//		sq.calculateCircumference();
		
		
	}
}
