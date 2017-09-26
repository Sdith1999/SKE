package opl;

import java.util.Scanner;

public class trp {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cnt = 0, cnt2 = 0, min=99999, max=-999999;
		String ans = "A";
		while(ans.equals("A")){
			System.out.print("Enter a number : ");
			int num = Integer.parseInt(input.nextLine());
			System.out.printf("Factors of %d are:\n", num);
			for(int i=1; i<=num; i++){
				if(num%i==0){
					System.out.print(i);
					for(int j=1; j<=i; j++){
						if(i%j==0){
							cnt++;
						}
					}
						if(cnt==2){
							System.out.print("<----Prime Number");
							cnt2++;
							if(max<i){
								max = i;
							}
							if(min>i){
								min = i;
							}
						}
					cnt = 0;
					System.out.println();
				}
			}
			System.out.printf("Total Prime Number = %d\n", cnt2);
			System.out.printf("Min prime is %d, Max prime is %d\n", min, max);
			System.out.print("(A)gain ot (Q)uit : ");
			ans = input.nextLine();
			min=99999; max=-999999;
			cnt2 = 0;
		}
		System.out.print("Bye Bye");
	}
}


