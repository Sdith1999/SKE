package opl;

import java.util.Scanner;

public class uo {
	
	static Scanner scanner = new Scanner(System.in);

	static String ReadString(String text) {
		System.out.print(text);
		String command = scanner.nextLine();
		return command;
	}

	static int ReadInt(String text) {
		System.out.print(text);
		int num = Integer.parseInt(scanner.nextLine());
		return num;
	}

	static void GetPoint(int[] x, int[] y, int i) {
		x[i] = ReadInt("Enter x" + (i + 1) + " :");
		y[i] = ReadInt("Enter y" + (i + 1) + " :");
	}

	static int GetSetPoint(int[] x, int[] y) {
		String command = "";
		int i = 0;
		do {
			GetPoint(x, y, i);
			i++;
			command = ReadString("(m)ore, (e)nd :");

		} while (!command.equals("e"));
		return i;
	}

	static void ShowPoint(int[] x, int[] y, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Point %d = (%d,%d)\n", i + 1, x[i], y[i]);
		}
	}

	static double FindDistance(int[] x, int[] y, int i1, int i2) {
		return Math.sqrt(Math.pow(x[i2] - x[i1], 2) + Math.pow(y[i2] - y[i1], 2));
	}

	static double FindPerimeter(int[] x, int[] y, int n) {
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			if (i == n - 1)
				sum += FindDistance(x, y, i, 0);
			else
				sum += FindDistance(x, y, i, i + 1);
		}
		return sum;
	}

	static double FindArea(int[] x, int[] y, int n){
		double sum=0.0;
		for (int i = 0; i < n; i++) {
			if (i == n - 1)
				sum += x[i]*y[0]-y[i]*x[0];
			else
				sum += x[i]*y[i+1]-y[i]*x[i+1];
		}
		return Math.abs(sum)/2;
	}
	static void CopyArray(int[] aold,int[] anew,int n){
		for(int i=0;i<n;i++){
			anew[i]=aold[i];
		}
	}
	
	static void ClockWise(int[] x, int[] y,int n,int[] xnew,int[] ynew){
			
		CopyArray(x, xnew, n);
		CopyArray(y, ynew, n);		
		
		for(int i=n-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(xnew[j]>xnew[j+1]){
					
					int c;
					c=xnew[j];
					xnew[j]=xnew[j+1];
					xnew[j+1]=c;
					
					c=ynew[j];
					ynew[j]=ynew[j+1];
					ynew[j+1]=c;
				}
			}
		}
		
		int[][] yplus = new int[20][2];
		int[][] yminus = new int[20][2];
		int yp=0;
		int ym=0;
		
		for(int i=0;i<n;i++){
			if(i==0){
				yplus[yp][0]=xnew[i];
				yplus[yp++][1]=ynew[i];
			}else{
				if(ynew[i]>=ynew[0]){
					yplus[yp][0]=xnew[i];
					yplus[yp++][1]=ynew[i];
				}else{
					yminus[ym][0]=xnew[i];
					yminus[ym++][1]=ynew[i];
				}
			}
		}
		
		for(int i=0;i<n;i++){
			if(i<yp){
				xnew[i]=yplus[i][0];
				ynew[i]=yplus[i][1];
			}else{
				xnew[i]=yminus[--ym][0];
				ynew[i]=yminus[ym][1];
			}
		}
		
		ShowPoint(xnew, ynew, n);
	}
	
	public static void main(String[] args) {
		String command = "";
		int[] x = new int[20];
		int[] y = new int[20];
		int length = GetSetPoint(x, y);
		do {

			command = ReadString("(s)how points, (p)erimeter, (n)ew, (q)uit :");
			switch (command) {
			case "s":
				ShowPoint(x, y, length);
				break;
			case "p":
				System.out.printf("Perimeter is %.2f\n", FindPerimeter(x, y, length));
				break;
			case "n":
				length = GetSetPoint(x, y);
				break;
			case "q":
				System.out.println("Bye");
				break;
			}
		} while (!command.equals("q"));
	}
}
		



