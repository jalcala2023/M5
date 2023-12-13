/*
 * Canvi qualsevol
*/
package gitTerminal02;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

                System.out.println("Enter the radius in meters: ");
                double radi = in.nextDouble();

                in.close();

        }

	/**
	 * Calculates the area of a circle
	 * 
	 * @param radius is a double numbers
	 * @return a double: the area of a circle
	 */
	public static double area(double radius) {

		return 3,14 * Math.pow(radius, 2);
	}

	/**
	 * Calculates the perimeter of a circle
	 * 
	 * @param radius is a double numbers
	 * @return a double: the perimeter of a circle
	 */
	public static double perimeter(double radius) {

		return (2 * 3,14) * radius;
	}

	/**
	 * TUI = Terminal User Interface
	 * 
	 * @param args not used.
	 */
	public static void print(String[] args) {

		System.out.println("\nThe area is: " + area(radi));

		System.out.println("\nThe perimeter is: " + perimeter(radi));

	}
}
