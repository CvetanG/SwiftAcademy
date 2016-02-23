package bg.swiftacademy.homework_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Task_02 {

	public static void readFile(String fileName) throws FileNotFoundException {

		File file = new File(fileName);

		Scanner fileReader = new Scanner(file);

		int lineNumber = 0;

		while (fileReader.hasNextLine()) {
			lineNumber++;

			String str = fileReader.nextLine();
			char[] charArray = str.toCharArray();

			 for (char c : charArray) {
			 System.out.print(c);
			 }
			 System.out.println();
			try {
				parseLine(charArray, fileName, lineNumber);
				System.out.println("<<< Parse OK! >>>");
			} catch (FileParseException e) {
				// throws exception sysout; 
				// System.out.println(e);
				e.getMessage();
			}
			// System.out.printf("Line %d: %s%n",
			// lineNumber, str);
		}
		fileReader.close();
	}

	static void parseLine(char[] charArray, String fileName, int lineNumber) throws FileParseException {
		boolean containesNumber = true;
		for (int i = 0; i < charArray.length; i++) {
			if ((charArray[i] > 47) && (charArray[i] < 58)) {
				containesNumber = false;
				break;
			} else {
				continue;
			}
		}
		if (containesNumber) {
			throw new FileParseException(fileName, lineNumber);
		}
	}

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		readFile("sample.txt");
	}

}
