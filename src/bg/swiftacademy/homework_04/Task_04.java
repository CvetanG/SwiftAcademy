package bg.swiftacademy.homework_04;

import java.util.Arrays;
import java.util.Scanner;

public class Task_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a valid number for cols: ");
		int m = input.nextInt();
		
		int [] array = new int[m];
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = ((int)(Math.random()*100+1));
        }
        
        //print generated matrix
        for (int i = 0 ; i < array.length ; i++) {
        	System.out.print(array[i] + " ");
        }
        
        double sum =0;
        
        for (int i= 0;  i < array.length; i++) {
        	sum += array[i];
		}
        
        System.out.println();
        System.out.println();
//        System.out.println(sum);
        System.out.println("The average number is: " + sum/m);
        
        Arrays.sort(array);
        System.out.println("Max. element is: " + array[m-1]);
        
        
        input.close();
	}

}
