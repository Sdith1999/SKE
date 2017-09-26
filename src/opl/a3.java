package opl;

import java.util.Scanner;

public class a3 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int answer; 
		int pizza = 0, chickens = 0, coke = 0; 
		int piece; 

		System.out.println("---------- Welcome to SKE Restaurant ----------"); 
		System.out.println("1.) Pizza\t\t250\tBaht."); 
		System.out.println("2.) Chickens\t\t120\tBaht."); 
		System.out.println("3.) Coke\t\t45\tBaht."); 
		System.out.println("4.) Total"); 
		System.out.println("5.) Exit"); 
		do { 
		System.out.print("\nEnter your Choices : "); 
		answer = sc.nextInt(); 
		piece = 0; 
		if (answer == 1) { 
		System.out.print("Enter Quantity : "); 
		piece = sc.nextInt(); 
		pizza = pizza + piece; 
		} else if (answer == 2) { 
		System.out.print("Enter Quantity : "); 
		piece = sc.nextInt(); 
		chickens = chickens + piece; 
		} else if (answer == 3) { 
		System.out.print("Enter Quantity : "); 
		piece = sc.nextInt(); 
		coke = coke + piece; 
		} else if (answer == 4) { 
		System.out.println("+-------Menu-------+--Qty--+--Price--+"); 
		if (pizza > 0) { 
		System.out.printf("| Pizza\t\t |%5d |%8d |\n", pizza, pizza*250); 
		} 
		if (chickens > 0) { 
		System.out.printf("| Chickens\t |%5d |%8d |\n", chickens, chickens*120); 
		} 
		if (coke > 0) { 
		System.out.printf("| Coke\t\t |%5d |%8d |\n", coke, coke*45); 
		} 
		System.out.println("+------------------------------------+"); 
		System.out.printf("| Total\t\t\t |%8d |\n", (coke*45)+(chickens*120)+(pizza*250)); 
		System.out.println("+------------------------------------+"); 
		} 
		} 
		while (answer != 5); 
		System.out.print("======Thank you ======="); 
		} 
		}


