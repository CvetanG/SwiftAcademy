package bg.swiftacademy.homework_04;

import java.util.Arrays;

public class Task_02B {

	public static void main(String[] args) {
		String [] array01 = {"abc", "bcd", "cde"};
		String [] array02 = {"abc", "bcd", "cde"};
		String [] array03 = {"abc", "bcd", "bcd"};
		String [] array04 = {"abc", "bcd"};

		String [] check01 = array01;
		String [] check02 = array02;

		boolean equal = true;

		for (int i = 0; i < check01.length; i++) {
			if (check01.length != check02.length) {
				equal = false;
				break;
			} else if (check01[i].equals(check02[i])) {
				equal = true;
			} else {
				equal = false;
				break;
			}
		}
		
		if (equal) {
			//			System.out.println("Both arrays have the same indexes");
			System.out.printf("%s and %s have the SAME length/index!",
					Arrays.toString(check01), Arrays.toString(check02));
		} else {
			//			System.out.println("Both arrays have different index ");
			System.out.printf("%s and %s have DIFFERENT length/indexes!",
					Arrays.toString(check01), Arrays.toString(check02));
		}
	}

}
