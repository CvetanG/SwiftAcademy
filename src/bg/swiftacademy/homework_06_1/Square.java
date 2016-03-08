package bg.swiftacademy.homework_06_1;

class Square extends Rectangle {
	
//	private int a;
	
//	public Square() {
//		super();
//	}
	
	public Square(int a) {
        super(a , a);
    }
	
	@Override
	public void printSides() {
		System.out.printf("Square side = %d%n", a);
	}
	
	@Override
	public void calculateSurface() {
		double result = a*a;
		System.out.println("Square Surface = " + result);
	}
	
	@Override
	public void calculateCircumference() {
		double result = 4*a;
		System.out.println("Square Circumference = " + result);
	}
	

}
