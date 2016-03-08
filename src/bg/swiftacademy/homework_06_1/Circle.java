package bg.swiftacademy.homework_06_1;

class Circle extends Shape {
	
	public Circle(int a) {
		super(a);
    }
	
	@Override
	public void printSides() {
		System.out.println("Radius = " + a);
	}
	
	@Override
	public void calculateSurface() {
		double result = Math.PI*a*a;
		System.out.println("Circle Surface = " + result);
	}
	
	@Override
	public void calculateCircumference() {
		double result = 2*Math.PI*a;
		System.out.println("Circle Circumference = " + result);
	}

}
