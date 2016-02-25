package bg.swiftacademy.homework_06_2;

public class Room extends House implements Eat, Feed {
	
	String type;
	int food = 0;

	public Room (String type) {
		super();
		this.type = type;
	}
	
	public int getFood() {
		return food;
	}
	
	public void setFood(int food) {
		this.food = food;
	}
	
	
	// Interfaces are implemented just for demo.
	// So you can put and take food in a room
	
	@Override
	public void eat() {
		food --;
	}
	
	@Override
	public void feed() {
		food ++;
	}
}
