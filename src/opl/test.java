
	
		
	

	





























































package opl;


import java.util.Scanner;


public class test {
	static int x = 0,menu,quan,qpiz,ppiz,qchi,pchi,pcoke,qcoke;
	static int piz = 0,chi=0,coke=0,quan1=0,quan2=0,quan3=0;
	static Scanner sc=new Scanner(System.in);
	static void wel(){
		System.out.println("-------Welcome to SKE Restaurant-------");
		System.out.printf("1.) Pizza\t%5d Baht.\n",250);
		System.out.printf("2.) Chickens\t%5d Baht.\n",120);
		System.out.printf("3.) Coke\t%5d Baht.\n",45);
		System.out.printf("4.)Total\n");
		System.out.printf("5.)Exit\n");
		
	}
	static void bill(int menu,int quan,int x){
		if (menu==4){
			System.out.println("+------Menu----+---Qty---+---Price---+");
		 if(piz>0){
			 System.out.printf("|Pizza\t\t     |\t%d     |\t%5d     |\n",qpiz,ppiz);
		 }
		 if (chi>0){
			 System.out.printf("|Chickens\t\t     |\t%d     |\t%5d     |\n",qchi,pchi);
		 }
		 if (coke>0){
			 System.out.printf("|Coke\t\t     |\t%d     |\t%5d     |\n",pcoke,qcoke);
		 }
		 int qall= qpiz+qchi+qcoke;
		 System.out.println("------------------+---------+----------+");
		 System.out.printf("|Total\t\t     |\t%d     |\t%5d     |\n",qall,x);
		 System.out.println("------------------+---------+----------+");
		 System.out.println();
	
		}
		
	}
	static int pizz (int menu,int quan){
		if (menu==1){
			quan1 = quan1+quan;
			ppiz=quan1*250;
			ppiz=quan1;
			piz++;
			
		}
		return ppiz;
	}
	static int chic (int menu,int quan){
		if (menu==2){
			quan2 = quan2+quan;
			pchi=quan2*120;
			pchi=quan2;
			chi++;
			
		}
		return pchi;
	}
	static int cok (int menu,int quan){
		if (menu==3){
			quan3 = quan3+quan;
			pcoke=quan3*45;
			pcoke=quan3;
			coke++;
			
		}
		return pcoke;
	}
	public static void main(String[] args){
		wel();
	do{
		do{
			do{
				System.out.print("Enter your Choice: ");
				System.out.println();
				menu=sc.nextInt();
				if (menu>5){
					System.out.println("Incorrect menu");
					System.out.println();	
				}
				}
			while (menu>5);
			bill (menu,quan,x);
		}
		while (menu==4);
		if (menu ==5){
		System.out.print("======Thank you =======");
		break;
		}
		System.out.print("Enter Quantity: ");
		quan =sc.nextInt();
		x = pizz( menu, quan)+ chic( menu, quan)+cok( menu, quan);
		System.out.println();
		}
	while (menu !=5||menu<5);
		
	}
}

		
	

	
	
	
	
	
	
	
	
	
	
	
	
		


