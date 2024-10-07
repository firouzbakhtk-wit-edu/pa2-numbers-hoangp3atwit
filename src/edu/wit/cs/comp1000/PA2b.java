package edu.wit.cs.comp1000;

// Johanna Hoang
import java.util.Scanner;

public class PA2b {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

/** gather input from user
 * 
 */
System.out.print("enter a, b, and c: ");
double a = scanner.nextDouble();
double b = scanner.nextDouble();
double c = scanner.nextDouble();

/** calculate the discriminant
 * 
 */
double discriminant = b * b - 4 * a * c;

/** determine roots
 * 
 */
if (discriminant < 0) {
	System.out.println("Roots: Imaginary");
} else if (discriminant == 0) {
	double root = -b/ (2 * a);
	System.out.printf("Root: %.2f%n", root);
} else {
	double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
	double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
	
	System.out.printf("roots: %.2f, %.2f%n", Math.min(root1, root2), Math.max(root1, root2));
}
	}
}

