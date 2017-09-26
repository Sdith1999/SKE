package opl;

import java.util.Scanner;

public class er {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 2,y=1;

		do {
			System.out.print("Input N: ");
			x = sc.nextInt();
			if (x > 1) {while(y<=12){
				System.out.println(x + " x " + y + " = " + x * y);
			   y++;
				}
				
			}
		} while (x > 1);
	}
}		
				


