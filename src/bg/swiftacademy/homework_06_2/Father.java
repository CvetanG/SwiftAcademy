package bg.swiftacademy.homework_06_2;

public class Father extends Person implements Feed, EnterRoom {
	
	public Father(String name, int age, Room room) {
		super(name, age, room);
		this.gender = 'M';
	}
	
	@Override
	public void enterRoom(Room room) {
		this.room = room;
		System.out.printf("%s entred in %s%n", name, room);
	}
	
//	@Override
//	public void feed(Room room) {
////		((Room)this).food ++;
//		room.food ++;
//		System.out.printf("%s left food in %s%n", name, room.type);
//		System.out.printf("There is %d food in %s%n", room.food, room.type);
//	}
	
	@Override
	public void feed() {
		this.room.food ++;
		System.out.printf("%s left food in %s%n", name, room.type);
		System.out.printf("There is %d food in %s%n", room.food, room.type);
	}
}
