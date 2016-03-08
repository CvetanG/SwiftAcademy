package bg.swiftacademy.homework_06_1;

public abstract class Shape {
	
	int a;
	int b;
	int c;
	
	public Shape(){
	}
	
	public Shape(int a){
		this.a = a;
	}
	
	public Shape(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public Shape(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public abstract void printSides(); 
	public abstract void calculateSurface(); // lice
	public abstract void calculateCircumference(); //perimetar
}
