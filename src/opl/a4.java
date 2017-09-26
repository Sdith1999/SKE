package opl;
import java.util.Scanner;
public class a4 {
        public static Scanner sc = new Scanner(System.in);
		public static int answer;
		public static int pizza = 0, chickens = 0, coke = 0;
		public static int piece;
		
		public static void getPizza() {
			System.out.print("Enter Quantity : ");
			piece = sc.nextInt();
			pizza = pizza + piece;
		}
		
		public static void getChickens() {
			System.out.print("Enter Quantity : ");
			piece = sc.nextInt();
			chickens = chickens + piece;
		}
		
		public static void getCoke() {
			System.out.print("Enter Quantity : ");
			piece = sc.nextInt();
			coke = coke + piece;
		}
		
		public static int setPricePizza() {
			return pizza*250;
		}
		
		public static int setPriceChickens() {
			return chickens*120;
		}
		
		public static int setPriceCoke() {
			return coke*45;
		}
		
		public static void main(String[] args) {

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
					getPizza();
				} else if (answer == 2) {
					getChickens();
				} else if (answer == 3) {
					getCoke();
				}  else if (answer == 4) {
					System.out.println("+-------Menu-------+--Qty--+--Price--+");
					if (pizza > 0) {
						System.out.printf("| Pizza\t\t   |%5d  |%8d |\n", pizza, setPricePizza());
					}
					if (chickens > 0) {
						System.out.printf("| Chickens\t   |%5d  |%8d |\n", chickens, setPriceChickens());
					}
					if (coke > 0) {
						System.out.printf("| Coke\t\t   |%5d  |%8d |\n", coke, setPriceCoke());
					}
					System.out.println("+------------------------------------+");
					System.out.printf("| Total\t\t\t   |%8d |\n", setPricePizza()+setPriceChickens()+setPriceCoke());
					System.out.println("+------------------------------------+");
				}
			}
			while (answer != 5);
			System.out.print("======Thank you ======="); 
		}
	}


	
		


