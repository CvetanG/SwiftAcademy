package bg.swiftacademy.homework_06_2;

public class Room extends House implements Eat, Feed {
	
	String type;
	int food = 0;

//	public String getType() {
//		return type;
//	}
//	
//	public void setType(String type) {
//		this.type = type;
//	}
//	
	public int getFood() {
		return food;
	}
	
	public void setFood(int food) {
		this.food = food;
	}
	
	public Room () {
//		this.type = "Living Room";
	}
	
	public Room (String type) {
		this.type = type;
	}
	
	@Override
	public void eat() {
		food --;
	}
	
	@Override
	public void eat(Room room) {
		food --;
	}
	
	@Override
	public void feed() {
		food ++;
	}
	
	@Override
	public void feed(Room room) {
		food ++;
	}
	
}
