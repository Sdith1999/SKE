//package opl;
//
//import java.util.Scanner;
//
//public class pr {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("roof :");
//		int x=.nextInt()
//	}
//}
//














































































package opl;

import java.util.Scanner;

public class pr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int y = 2;
		System.out.print("wall: ");
		int x = sc.nextInt();
        for (int i = x; i >= 1; i--) {
			
			for (int a = 1; a < i; a++) {
				System.out.print("x");
			}
			System.out.print("x");
			
			if (i != x && i != 999) {
				for (int b= 1; b<= 2 * (y ) - 1; b++) {
					System.out.print("x");
				}
				y++;
				System.out.print("");
			}
		
//			else if (i == 1) {
//				for (int c = 2; c<= x; c++) {
//					System.out.print("+ ");
//				}
//			}
			System.out.println("");
		}
	}
}
		
		

		






















//package opl;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class pr {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		Random rand = new Random();
//		
//		int numGuess = -1;
//		int tries = 1;
//		String choice = "t";
//
//		while (choice.equals("t")) {
//			int randNum = rand.nextInt(6) + 1;
//			System.out.println("result:" + randNum);
////	        for (int i = 1 ; i <= tries; i++) {
////			System.out.printf("More than (Tries:%d)\n", tries++);
////	        System.out.println("Toss"+ tries);
////			i++;
////			
////	        }
//	        
////			while (numGuess != randNum) {
////				System.out.print("");
////				numGuess = Integer.parseInt(input.nextLine());
////				if (numGuess < randNum) {
////					System.out.printf(" (To:%d)\n", tries++);
////				} else if (numGuess > randNum) {
////					System.out.printf(" (Tries:%d)\n", tries++);
////				} else
////					System.out.println("Toss  " + tries);
////			
////			}
//			
//			System.out.print("(t)oss,(q)uit:");
//			choice = input.nextLine();
//			if(choice.equals("q"))
//				System.out.println("Bye ");
//			else if(choice.equals("t")){
//				tries=1;
//				numGuess=-1;
//			}
//			
//		}
//	}
//}

