package opl;

import java.util.Scanner;

public class a1 {
	Scanner scanner = new Scanner(System.in);
	
	String text = scanner.nextLine();
	
	char charac = text.charAt(0);
	int n = charac-96;
	
	for(int i=1;i<=n;i++){
		if(i==1){
			for(int j=n;j>=1;j--){
				System.out.printf("%c",j+96);
			}
			System.out.println();
		}else if(i==n){
			for(int j=1;j<=n;j++){
				System.out.printf("%c",j+96);
			}
			System.out.println();
		}else {
			System.out.printf("%c",(n+1)-i+96);
			for(int j=1;j<=n-2;j++){
				System.out.print(" ");
			}
			System.out.printf("%c",i+96);
			System.out.println();
		}
	}

}

}


