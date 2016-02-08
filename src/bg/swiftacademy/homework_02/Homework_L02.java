package bg.swiftacademy.homework_02;

/**
 * 
 * Created by Cvetan on 1.02.2016 г.
 *
 */
public class Homework_L02 {

	public static void main(String[] args) {
		// Task.01 Declare some variables
//		byte centuries = 20; // stoinosten tip
//		short years = 2000;// stoinosten tip
//		int days = 730480;// stoinosten tip
//		long hours = 17531520;// stoinosten tip
//		
//		char male = 'M'; // stoinosten tip
//		char female = 'F'; // stoinosten tip
//		
//		float floatPI = 3.141592653589793238f; // stoinosten tip
//		double doublePI = 3.141592653589793238; // stoinosten tip
//		
//		boolean equal = true; // stoinosten tip
//		
//		String firstName = "Ivan"; // referenten tip
//		String lastName = "Ivanov"; // referenten tip
//		Object container = 5; // referenten tip
//		Object container2 = "Five"; // referenten tip
		
		// Task.02 Declare some variables
		
//		int numberInDec = 256;
//		int numberInOcatal = 0400;
//		int numberInHex = 0x100;
//		System.out.println(numberInDec);
//		System.out.println(numberInOcatal);
//		System.out.println(numberInHex);
		
		// Task.03 Please check attached Task_03.jpg file
		
//		// Task.04 
//		String name = new String();
//		byte age;
//		char sex;
//		double accountNumber;
//		char firstLetter;
//		String eyesColor = new String();
//		
//		// Task.05 Declare some variables
//		short a = -180;
//		byte b = 5;
//		BigInteger c = new BigInteger("9834289023490");
//		float d = 7.7f;
//		double e = 9.802349004;
//		short f = 1999;
//		BigInteger g = new BigInteger("123456789123456789");
//		
//		c = c.add(g);
//		System.out.println(c);
		
		
//		// Task.06 
//		String str1 = "Hello";
//		String str2 = "World";
//		Object obj1 = (str1 + " " + str2);
//		System.out.println(obj1);
//		String str3 = (String)obj1;
		
		
		// Task.07 Declare some variables
//		int a = 5;
//		int b = 10;
//		int c = a;
//		a = b;
//		b = c;
//		System.out.println(a + " " + b);
		
		// Task.08
//		double doubleDigit = 3.5;
//		float floatDigit = 3.5f;
		double doubleDigit = 3.2;
		float floatDigit = 3.2f;
		
		System.out.println("doubleDigit == floatDigit: " + (doubleDigit == floatDigit));//true false
		System.out.println("doubleDigit != floatDigit: " + (doubleDigit != floatDigit));//false true
		System.out.println("doubleDigit <= floatDigit: " + (doubleDigit <= floatDigit));//true true
		System.out.println("doubleDigit < floatDigit: " + (doubleDigit < floatDigit));//false true
		System.out.println("doubleDigit > floatDigit: " + (doubleDigit > floatDigit));//false false
		System.out.println("doubleDigit >= floatDigit: " + (doubleDigit >= floatDigit));//true false
		
/*		При работата с реални числа не всяко число има точно представяне в типовете
 *      с плаваща запетая (float и double) и поради закръглянето се получават грешки.
 *      По тази причина често пъти сравнението на реални числа се прави с някаква
 *      точност, например 0.000001. Счита се, че две реални числа са равни, ако имат
 *      много малка разлика по абсолютна стойност.
*/	
		
//		//Task. 09
//		 short a = 3; // 0000 0011 = 3
//		 short b = 5; // 0000 0101 = 5
//		 short c = 65; // 0100 0001 = 5
//		 System.out.println( a | b); // 0000 0111 = 7
//		 System.out.println( a & b); // 0000 0001 = 1
//		 System.out.println( a ^ b); // 0000 0110 = 6
//		 System.out.println(~a & b); // 0000 0100 = 4
//		 System.out.println(a << 1); // 0000 0110 = 6
//		 System.out.println(a << 2); // 0000 1100 = 12
//		 System.out.println(a >> 1); // 0000 0001 = 1
//		 
//		 System.out.println(b >>> 1); // 0000 0010 = 2
//		 System.out.println(b >>> 2); // 0000 0001 = 1
//		 System.out.println(b >>> 3); // 0000 0000 = 0
//		 System.out.println(c >>> 1); // 0010 0000 = 32
//		 System.out.println(c >>> 2); // 0001 0000 = 16
//		 System.out.println(c >>> 3); // 0000 1000 = 8
		
	}

}
