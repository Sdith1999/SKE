package opl;

import java.util.Scanner;

public class yo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y = 0, x = 0;

		while (x >= 0) {
			System.out.print("Input N: ");
			x= sc.nextInt();
			if (x >= 0) {
				String f = "Factors of " + x+ " are ";

				for (int i = 1; i <= x; i++) {
					if (x % i == 0) {
						f = f + i + " ";
						y = y + i;

					}
				}
				System.out.println(f);
				System.out.println("Summation of factors is " + y);
				if (y == x + 1)
					System.out.println(x + " is prime number.");
				else
					System.out.println(x+ " is not prime number.");

				y= 0;
			}
		}
		System.out.println("Program ends.");
	}

		

	}


