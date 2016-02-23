package bg.swiftacademy.homework_06_2;

public class Child extends Person implements Feed, EnterRoom {
	
	public Child(String name, int age) {
		this.name = name;
		this.gender = 'M';
		this.age = age;
		this.room = null;
	}
	
	
	public Child(String name) {
		this.name = name;
		this.gender = 'M';
		this.age = 42;
		this.room = null;
	}
	
	public Child() {
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
