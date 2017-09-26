package opl;

import java.util.Scanner;

	public class to {	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input nap time: ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("Input snooze time: ");
		int y = Integer.parseInt(sc.nextLine());
		String t="Snooze";
		int i=1;
		
		System.out.println("Nap time starts.");
		
		while( t.equals("Snooze")&&!t.equals("Dismiss") ){
			System.out.println(i + " min");
			if(i>=x){
				if(i==x||(i-x)%y==0){
					System.out.print("Alarm rings . Dismiss or Snooze: ");
					t = sc.nextLine();
				}
			}
			i++;
		}
	}
	
	}


