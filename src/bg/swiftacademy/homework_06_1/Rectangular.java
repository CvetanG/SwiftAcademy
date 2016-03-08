package bg.swiftacademy.homework_06_1;

class Rectangle extends Shape {
	
//	private int a = ((int)(Math.random()*20)+1);
//	private int b = ((int)(Math.random()*20)+1);
	
	
//	public Rectangle() {
//		super();
//	}
	
	public Rectangle(int a, int b) {
		super(a, b);
    }
	
	@Override
	public void printSides() {
		System.out.printf("Rectangle sides = %d  %d%n", a, b);
	}
	
	@Override
	public void calculateSurface() {
		double result = a*b;
		System.out.println("Rectangle Surface = " + result);
	}
	
	@Override
	public void calculateCircumference() {
		double result = 2*(a + b);
		System.out.println("Reactangle Circumference = " + result);
	}
}
