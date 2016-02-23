package bg.swiftacademy.homework_06_1;

public abstract class Shape {
	
	int a;
	int b;
	
	public abstract void calculateSurface();
	public abstract void calculateCircumference();
}



class Circle extends Shape {
	
	private int a;
	
//	public int getA() {
//		return a;
//	}

//	public void setA(int a) {
//		this.a = 5;
//	}
	
//	Circle circle = new Circle();
//	setA((Math.random()*40)+10);
	public Circle() {
        this.a = ((int)(Math.random()*20)+1);
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

class Rectangle extends Shape {
	
	private int a;
	
//	public int getA() {
//		return a;
//	}
//
//	public double setA() {
//		a = (Math.random()*40+10);
//		return a;
//	}

	private int b;
	
//	public int getB() {
//		return b;
//	}

//	public double setB() {
//		b = (Math.random()*40+10);
//		return b;
//	}
	
	public Rectangle() {
        this.a = ((int)(Math.random()*20)+1);
        this.b = ((int)(Math.random()*20)+1);
    }
//	Rectangle rect = new Rectangle();
//	rect.setA((Math.random()*40)+10); 
//	rect.setB((Math.random()*40)+10);
	
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

class Square extends Shape {
	private int a;
	
//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//	
//	Square square = new Square();
	
	public Square() {
        this.a = ((int)(Math.random()*20)+1);
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
