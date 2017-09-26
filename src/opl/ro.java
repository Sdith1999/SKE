package opl;

public class ro {
	import java.util.Scanner;

	public class ro {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter a: ");
			int a = input.nextInt();
			System.out.print("Enter b: ");
			int b = input.nextInt();
			System.out.print("Enter c: ");
			int c = input.nextInt();
			System.out.print("Enter d: ");
			int d = input.nextInt();
			System.out.print("Enter the starting value of n: ");
			int nStart = input.nextInt();
			System.out.print("Enter the ending value of n: ");
			int nEnd = input.nextInt();
			double fn = 0, max = 0, min = 0;
			int cmin = 0, cmax = 0;

			if (nStart <= nEnd) {
				for (int i = nStart; i <= nEnd; i++) {
					fn = (a * i * i * i) + (b * i * i) + (c * i) + d;
					if (i == nStart) {
						max = fn;
						min = fn;
						cmax = i;
						cmin = i;
					} else {
						if (fn > max) {
							max = fn;
							cmax = i;
						} else if (fn < min) {
							min = fn;
							cmin = i;
						}
					}
				}
				System.out.printf("Minimum of f(n)=%.0f at n=%d\n", min, cmin);
				System.out.printf("Maximum of f(n)=%.0f at n=%d", max, cmax);

			} else {
				System.out.println("Invalid range!");
			}

		}

	}



