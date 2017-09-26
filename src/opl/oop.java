package opl;

import java.util.Scanner;

public class oop {
	static Scanner sc = new Scanner(System.in);

	public static double computeRectangleArea(double x, double y) {
		return x * y;
	}

	public static void main(String[] arg) {

		System.out.println("Enter Rectangle:");
		System.out.print("Width: ");
		double x = sc.nextDouble();
		System.out.print("Length: ");
		double y = sc.nextDouble();

		System.out.printf("Area of %.2f x %.2f rectangle = %.2f", x, y, computeRectangleArea(x, y));

	}

}