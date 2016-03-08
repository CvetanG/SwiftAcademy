package bg.swiftacademy.homework_06_1;

public class Main {
	
	public static void main (String[] args) {
		
		Shape[] shapesArrey = new Shape[10];
		
		for (int i = 0; i < shapesArrey.length; i++) {
			shapesArrey[i] = RandomShape.createShape();
		}
		
//		for (Shape myShape : shapesArrey) {
//			System.out.println(myShape);
//		}
		
		for (int i = 1; i <= shapesArrey.length; i++) {
			System.out.print(i + ".");
			shapesArrey[i-1].printSides();
			System.out.print(i + ".");
			shapesArrey[i-1].calculateSurface();
			System.out.print(i + ".");
			shapesArrey[i-1].calculateCircumference();
			System.out.println();
		}
		
		
	}
}
