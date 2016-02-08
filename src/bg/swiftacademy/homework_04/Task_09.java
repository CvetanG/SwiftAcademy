package bg.swiftacademy.homework_04;

public class Task_09 {

	private static final String ONES[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private static final String TEENS[] = { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen" };
	private static final String TENS[] = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
			"eighty", "ninety" };
	private static final String HUNDRED = "hundred";
	private static final String AND = "and";
	private static final String ONE_THOUSAND = "onethousand";

	public static void main(String[] args) {
		
		StringBuilder temp = new StringBuilder();
		int length = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i == 1000) {
				temp.append(ONE_THOUSAND);
			} else {
				int hundreds = i / 100;
				int hundredRemainder = i % 100;
				if (hundreds > 0) {
					temp.append(ONES[hundreds]).append(HUNDRED);
					if (hundredRemainder != 0) {
						temp.append(AND);
					}
				}
				if (hundredRemainder > 10 && hundredRemainder < 20) {
					temp.append(TEENS[(hundredRemainder) % 10]);
				} else if (hundredRemainder < 10) {
					temp.append(ONES[hundredRemainder]);
				} else {
					temp.append(TENS[(hundredRemainder) / 10]);
					if ((hundredRemainder) % 10 > 0) {
						temp.append(ONES[(hundredRemainder) % 10]);
					}
				}
			}
			length += temp.length();
			temp.replace(0, temp.length(), "");
		}
		System.out.printf("The number of letters is: %d %n", length);
	}
}

