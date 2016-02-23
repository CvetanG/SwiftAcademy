package bg.swiftacademy.homework_06_2;

public class Main {
	
	public static void printFood(Room[] rooms) {
		System.out.println();
		for (Room room : rooms) {
			System.out.printf("There is %d food in %s%n", room.food, room.type);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Room Kitchen = new Room("Kitchen");
		Room LivingRoom = new Room("Living Room");
		Room DinningRoom = new Room("Dinning Room");
		Room BedRoom = new Room("BedRoom");
		
		Room[] rooms = new Room[] { Kitchen, LivingRoom, DinningRoom, BedRoom };
		
		printFood(rooms);
		
		BedRoom.feed();
		LivingRoom.feed();
		Kitchen.feed();
		
		printFood(rooms);
		
		BedRoom.eat();
		printFood(rooms);
		
		
		Father father1 = new Father("George", 46);
		Dog dog = new Dog();
		
//		father1.enterRoom(Kitchen);
//		father1.feed();
		father1.feed(Kitchen);
		
		printFood(rooms);
		
		dog.enterRoom(LivingRoom);
		dog.eat();
		printFood(rooms);
		
//		System.out.printf("%s%n", room1.type);
//		System.out.printf("%d%n", room1.food);
//		System.out.printf("%s, %s, %d.", father1.name, father1.gender, father1.age);
		
		
	}
	
}


/* creating names from console
 * 
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Write first dog's name: ");
	String firstDogName = input.nextLine();
	
	// Assign dog name with a constructor
	Dog firstDog = new Dog(firstDogName);
	
	System.out.print("Write second dog's name: ");
	Dog secondDog = new Dog();
	
	// Assign dog name with a property
	secondDog.setName(input.nextLine());
	
	// Create a dog with a default name
	Dog thirdDog = new Dog();
	
	Dog[] dogs = new Dog[] { firstDog, secondDog, thirdDog };
	
	for (Dog dog : dogs) {
		dog.bark();
	}
}*/
