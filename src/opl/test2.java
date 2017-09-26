package opl;


import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	}		
}
	



















































//package opl;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class test2 {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		Random rand = new Random();
//		
//		int numGuess = -1;
//		int tries = 1;
//		String choice = "P";
//
//		while (choice.equals("P")) {
//			int randNum = rand.nextInt(999) + 0;
//			System.out.println("Note: the random number is " + randNum);
//			while (numGuess != randNum) {
//				System.out.print("Guess a number (0-999):");
//				numGuess = Integer.parseInt(input.nextLine());
//				if (numGuess < randNum) {
//					System.out.printf("Less than (Tries:%d)\n", tries++);
//				} else if (numGuess > randNum) {
//					System.out.printf("More than (Tries:%d)\n", tries++);
//				} else
//					System.out.println("Correct! Well done!\nTotal tries = " + tries);
//			}
//			System.out.println("----------");
//			System.out.print("(P)lay again,(Q)uit:");
//			choice = input.nextLine();
//			if(choice.equals("Q"))
//				System.out.println("Bye Bye");
//			else if(choice.equals("P")){
//				tries=1;
//				numGuess=-1;
//			}
//			
//		}
//	}
//}


