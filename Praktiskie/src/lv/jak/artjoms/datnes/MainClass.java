package lv.jak.artjoms.datnes;

import java.util.Scanner;



public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DatnesApstrade datnesApstrade = new DatnesApstrade();
		
		System.out.println("Datu apstrade");
		System.out.println("1-Datu opcija");
		System.out.println("2-Datu nolasišana");
		System.out.println("0-Beigt darbu");
		System.out.print("Izvelaties darbību:");
		int darbiba =input.nextInt();
		System.out.println();
		
		switch (darbiba) {
		case 1:
			System.out.println("Ievadiet faila nosaukumu:");
			String fileName= input.next();
			
			System.out.println("Dati");
			System.out.print("Audzēkņa vārds:");
			String vards = input.next();
			System.out.print("Audzēkņa uzvārds:");
			String uzvards = input.next();
			System.out.print("Audzēkņa kurss:");
			String kurss = input.next();
			System.out.print("Audzēkņa videjais vertējums:");
			double vertejums = input.nextDouble();

			String text = uzvards+ ";" +vards+ ";" +kurss+ ";" +vertejums+"\n";
			fileName =fileName+ ".csv";
			
			datnesApstrade.writeToFile(fileName,text);
			
			break;
		
		case 2:
			System.out.println("Ievadiet faila nosaukumu:");
			String fileName3= input.next(); 
			fileName3 =fileName3+ ".csv";
			String text2 = datnesApstrade.readFile(fileName3); 
			
			String [] rindas = text2.split("\n");
			for (String  rinda : rindas) {
				System.out.println(rinda);
			}
			
			break;
		
		case 0:
			
			break;
			
		default:
			System.out.println("Nav šadas darbības");
			break;
		}input.close();
	}

}
