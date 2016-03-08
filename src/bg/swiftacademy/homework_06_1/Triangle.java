package bg.swiftacademy.homework_06_1;

public class Triangle extends Shape {
	
	public Triangle(int a, int b, int c) {
			super(a, b, c);
    }
	
	@Override
	public void printSides() {
		System.out.printf("Triangle sides = %d %d %d%n", a, b, c);
	}
	
	@Override
	public void calculateSurface() {
		// Херонова формула
		double p = (a + b + c) / 2.0;
//		double p = (a + b + c) / (double)2;
		double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Triangle Surface = " + result);
	}

	@Override
	public void calculateCircumference() {
		double result = a + b + c;
		System.out.println("Triangle Circumference = " + result);
	}
	
	
}
