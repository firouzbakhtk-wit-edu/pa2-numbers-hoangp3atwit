package edu.wit.cs.comp1000;

import java.util.Scanner;

// Johanna Hoang
public class PA2a {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/** Variables
		 * 
		 */
		int[] numbers = new int[5];
		int sumPos = 0;
		int sumNeg = 0;
		int countPos = 0;
		int countNeg = 0;
		
		/** gather user input
		 * 
		 */
		
		System.out.println("Enter five whole numbers: ");
		for (int i = 0; i < 5; i++) {
			System.out.print("Number" + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
			
			/** update numbers
			 */
			if (numbers[i] > 0) {
				sumPos += numbers [i];
				countPos++;
			} else {
				sumNeg += numbers[i];
				countNeg++;
				
			}
		}
		/** calculate total sum
		 *
		 */
		int totalSum = sumPos + sumNeg;
		 
		/** calculate average
		 * 
		 *
		 */
		double averagePos = 0;
		if (countPos > 0) {
			averagePos = (double) sumPos / countPos;
		}
		double averageNeg = 0;
		if (countNeg > 0) {
			averageNeg = (double) sumNeg / countNeg;
		}
		double averageTotal = (double) totalSum / 5;
		
		/** output
		 * 
		 */
		System.out.println("Sum of positive numbers: " + sumPos);
        System.out.println("Sum of non-positive numbers: " + sumNeg);
        System.out.println("Sum of all five numbers: " + totalSum);
        System.out.printf("Average of positive numbers: %.2f%n", averagePos);
        System.out.printf("Average of non-positive numbers: %.2f%n", averageNeg);
        System.out.printf("Average of all five numbers: %.2f%n", averageTotal);
	
        scanner.close();
	}


}