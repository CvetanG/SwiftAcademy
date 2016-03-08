package bg.swiftacademy.homework_06_1;

public class RandomShape {
	
	private static Shape randShape;
	private static int a;
	private static int b;
	private static int c;
	
	public static void createCirculRadius(){
		a = ((int)(Math.random()*20)+1);
//		System.out.println(a);
	}
	
	public static void createRectaqularSides(){
		a = ((int)(Math.random()*20)+1);
		b = ((int)(Math.random()*20)+1);
//		System.out.println(a + " " +  b);
	}
	
	public static void createSquareSides(){
		a = ((int)(Math.random()*20)+1);
//		System.out.println(a);
	}
	
	public static void createTriangleSides(){
		a = ((int)(Math.random()*20)+1);
		b = ((int)(Math.random()*20)+1);
		c = ((int)(Math.random()*20)+1);
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
//			System.out.println(a + " " +  b + " " + c);
		} else {
			createTriangleSides();
		}
	}
	
	private RandomShape() {
	}
	
	public static Shape createShape() {
		int r = ((int)(Math.random()*4)+1);
		switch (r) {
		case 1:
			createCirculRadius();
			randShape = new Circle(a);
			break;
		case 2:
			createRectaqularSides();
			randShape = new Rectangle(a, b);
			break;
		case 3:
			createSquareSides();
			randShape = new Square(a);
			break;
		case 4:
			createTriangleSides();
			randShape = new Triangle(a, b, c);
			break;
		}
		return randShape;
		
	}
	
}
