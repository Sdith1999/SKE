package opl;

import java.util.Scanner;

public class kop {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter character: ");
		String x = sc.nextLine();
		System.out.print("Enter size: ");
		int y= sc.nextInt();
		
		for(int i=1;i<=y;i++){
			for(int a=1;a<=i;a++){
				System.out.print(x);
			}
			System.out.println("");
		}
	}
}

	