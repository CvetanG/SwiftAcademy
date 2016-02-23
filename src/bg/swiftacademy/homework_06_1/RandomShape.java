package bg.swiftacademy.homework_06_1;


public class RandomShape {
	
	private RandomShape() {
	}
	
	public static String randShape(){
		String randomShape = new String();
		int rnd = ((int)(Math.random()*20)+1);
	
		if (rnd % 3 == 0) {
			randomShape = "Circle";
		} else if (rnd % 3 == 1) {
			randomShape = "Rectangle";
		} else if (rnd % 3 == 2) {
			randomShape = "Square";
		}
		return randomShape;
	}
}
