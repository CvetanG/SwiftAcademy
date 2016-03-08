package bg.swiftacademy.homework_06_1;

public class Test {
	
	int a;
	int b;
	int c;

	public Test() {
		this.a = 5;
		this.b = 10;
		this.c = 14;
	}

	public void printSides() {
		System.out.printf("Triangle sides = %d %d %d%n", a, b, c);
	}

	public void calculateSurface() {
		// Херонова формула
		double p = (a + b + c) / (double)2;
		System.out.println(p);
		double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Triangle Surface = " + result);
	}

	public void calculateCircumference() {
		double result = a + b + c;
		System.out.println("Triangle Circumference = " + result);
	}
	public static void main(String[] args) {
		Test tri = new Test();
		tri.printSides();
		tri.calculateSurface();
		tri.calculateCircumference();
		
	}

}
