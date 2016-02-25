package bg.swiftacademy.homework_06_2;

abstract class Person {
	
	String name;
	char gender;
	int age;
	Room room;
	
	public Person(String name, char gender, int age, Room room) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.room = room;
	}
	
	public Person(String name, int age, Room room) {
		this.name = name;
		this.age = age;
		this.room = room;
	}
	
}
