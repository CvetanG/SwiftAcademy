package bg.swiftacademy.homework_07;

public class FileParseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	public String fileName;
	public int lineNumber;

	public FileParseException() {
	}

	public FileParseException(String fileName, int lineNumber) {
		this.fileName = fileName;
		this.lineNumber = lineNumber;
		System.out.printf("Error while parsing file %s on line %d.",
				fileName, lineNumber);
		System.out.println();
	}

}
