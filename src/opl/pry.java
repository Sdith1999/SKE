package opl;

import java.util.Scanner;

public class pry {
	static Scanner sc = new Scanner(System.in);
	public static double computePytagoras(double x, double y) {
		return Math.sqrt(x*x+y*y);
	}
	public static double ReadDouble(String t){
		System.out.print(t);
		double z = sc.nextDouble();
		return z;
	}
	public static void main(String[] args) {
		 System.out.print("Enter first side: ");
		double x = sc.nextDouble();
		
		 System.out.print("Enter second side: ");
         double y =sc.nextDouble();
		System.out.printf("The side opposite to the right angle = %.4f",computePytagoras(x, y));

		
	}

}



