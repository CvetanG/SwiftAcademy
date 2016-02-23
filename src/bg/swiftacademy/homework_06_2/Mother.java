package bg.swiftacademy.homework_06_2;

public class Mother extends Person implements Feed, EnterRoom {
	
	public Mother(String name, int age) {
		this.name = name;
		this.gender = 'M';
		this.age = age;
		this.room = null;
	}
	
	
	public Mother(String name) {
		this.name = name;
		this.gender = 'M';
		this.age = 42;
		this.room = null;
	}
	
	public Mother() {
		this.name = "Peter";
		this.gender = 'M';
		this.age = 42;
		this.room = null;
	}
	
	
	@Override
	public void enterRoom(Room room) {
		this.room = room;
		System.out.printf("%s entred in %s%n", name, room);
	}
	
	@Override
	public void feed(Room room) {
//		((Room)this).food ++;
		room.food ++;
		System.out.printf("%s left food in %s%n", name, room.type);
		System.out.printf("There is %d food in %s%n", room.food, room.type);
	}
	
	@Override
	public void feed() {
		if (room == null) {
			System.out.printf("%s is not at home", name);
		} else {
		this.room.food ++;
		System.out.printf("%s left food in %s%n", name, room.type);
		System.out.printf("There is %d food in %s%n", room.food, room.type);
	
		}
	}
	
	
}
