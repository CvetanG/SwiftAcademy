package bg.swiftacademy.homework_03;

public class Task_02 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("The sum of all even number from 1 to 100 is: " + sum);
	}

}
