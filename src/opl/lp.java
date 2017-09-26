package opl;

import java.util.Scanner;

public class lp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		System.out.print("Enter d: ");
		int d = sc.nextInt();
		System.out.print("Enter the starting value of n: ");
		int x = sc.nextInt();
		System.out.print("Enter the ending value of n: ");
		int y = sc.nextInt();
		double n = 0, max = 0, min = 0;
		int min1 = 0, max1 = 0;

		if (x <= y) {
			for (int i = x; i <= y; i++) {
				n = (a * i * i * i) + (b * i * i) + (c * i) + d;
				if (i == x) {
					max = n;
					min = n;
					max1 = i;
					min1 = i;
				} else {
					if (n > max) {
						max = n;
						max1 = i;
					} else if (n < min) {
						min = n;
						min1 = i;
					}
				}
			}
			System.out.printf("Minimum of f(n)=%.0f at n=%d\n", min, min1);
			System.out.printf("Maximum of f(n)=%.0f at n=%d", max, max1);

		} else {
			System.out.println("Invalid range!");
		}

	}

}

	


