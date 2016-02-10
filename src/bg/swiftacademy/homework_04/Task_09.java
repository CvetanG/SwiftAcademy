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
		
		StringBuilder strBuilder = new StringBuilder();
		int allLetters = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if (i == 1000) {
				strBuilder.append(ONE_THOUSAND);
			} else {
				int hundreds = i / 100;
				int hundredRemainder = i % 100;
				if (hundreds > 0) {
					strBuilder.append(ONES[hundreds]).append(HUNDRED);
					if (hundredRemainder != 0) {
						strBuilder.append(AND);
					}
				}
				if (hundredRemainder > 10 && hundredRemainder < 20) {
					strBuilder.append(TEENS[(hundredRemainder) % 10]);
				} else if (hundredRemainder < 10) {
					strBuilder.append(ONES[hundredRemainder]);
				} else {
					strBuilder.append(TENS[(hundredRemainder) / 10]);
					if ((hundredRemainder) % 10 > 0) {
						strBuilder.append(ONES[(hundredRemainder) % 10]);
					}
				}
			}
			allLetters += strBuilder.length();
			strBuilder.replace(0, strBuilder.length(), "");
		}
		System.out.printf("All letters needed: %d %n", allLetters);
	}
}

