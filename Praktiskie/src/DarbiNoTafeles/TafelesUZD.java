package DarbiNoTafeles;
import java.util.Random;
import java.util.Scanner;

public class TafelesUZD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ievadiet skaitli 1-100:");						
		int a = input.nextInt();	
		Random r = new Random();
		int c = r.nextInt(100)+1;	
		for(int i = 1;i<=5;i++) {		
		
			if(a>10) {
				System.out.println("Vertiba ir parāk liela! ievadit citu");
				a = input.nextInt();	
			}else if(a<1) {
			System.out.println("Vertiba ir  parak maza! ievadit citu");
			a = input.nextInt();
			}
		
			else if(a!=c) {
				System.out.println("Jūs neatminējāt ciparu");
				a = input.nextInt();
			}
		}
		 if(a==c) {
				System.out.println("Jūs atminējāt ciparu");			
				}
		
		 
		}
			

	}


