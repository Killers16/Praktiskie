package lv.jak.artjoms.atkartojums;

import java.util.Scanner;

public class Atkartojums {

	public static void main(String[] args) {
		//1. Izveodot vienu mainigo katram datu tipam
		 
		int a;	//vesels skaitlis	
		byte a7;//vesels skaitlis
		long a6;//vesels skaitlis	
		short a5;//vesels skaitlis	
		
		String b;//simboli un simbolu virkne
		char a4;//simboli un simbolu virkne
		
		double a2;//decimali skaitli
		Float a3;//decimali skaitli
		
		Boolean a8;//loģiskie (true vai false)
		
		
		//2.Izveidot datu ievades objektu
		Scanner input = new Scanner(System.in);
		
		//3.Ivadīt pieprasijumu par vertību ievadīšanu
		//šadiem datu tipiem-int, long, float, double, String
		//un inicializēt iepriekš izveidot mainīgos.
		
		/* System.out.print("Ievadiet vertību long,int :");//float, double, String
		 	a = input.nextInt();
		 	a6 = input.nextLong();
		 	a3 = input.nextFloat();
		 	a2 = input.nextDouble();
		 	b = input.next();//var būt input.nextLine();
		 	*/ 
		 
		 //4.Izveidot pārbaudi, kas nosaka,vai ievadītais LONG dalas ar ievadito INT;
		 	/*System.out.print(a6%a);
		 	if(a6%a==0||a6%a!=0) {
		 		System.out.print(" dalas ar int");	
		 	}
		 	else if (a6%a!=0) {
		 	System.out.print("Ne dalas ar int");
		 	}
		*/
		
		 	//5.Uzraksti programmu kode , kas pieprasa ievadīt decimalu skaitli
		 	//tik ilgi ,kamer ievadīs
		
		do {
			System.out.print("ievadi decimalskaitli:");
			a2 = input.nextDouble();	
		}
	while(a2!=0);
		
			
		
		
		
			
		
		
	}
	
}
