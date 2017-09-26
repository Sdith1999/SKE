package opl;

import java.util.Scanner;

public class tre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 1, y = 1;
		double min = Double.MAX_VALUE, max = Double.MIN_VALUE, sum = 0;

		System.out.print("Enter amount of numbers: ");
		int z = sc.nextInt();

		for (int i = 1; i <= z; i++) {
			System.out.printf("Please input N%d: ", i);
			double num = sc.nextDouble();
			if(i==1){
				min=num;
				max= num;
			}
			sum = sum + num;
			if (num < min) {
				min = num;
				y=i;
			} else if (num > max) {
				max = num;
				x=i;
			}
		}
		System.out.printf("Average is %.2f\n", sum / z);
		System.out.printf("Minimum is N%d = %.2f\n", y, min);
		System.out.printf("Maximum is N%d = %.2f", x, max);
	}



	}


