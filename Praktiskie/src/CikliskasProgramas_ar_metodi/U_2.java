package CikliskasProgramas_ar_metodi;

import java.util.Scanner;

public class U_2 {

	public static int summa(int sum1){
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
	for(int i=1;i<=x;i++) {
		System.out.print(i+" ");		
				sum1 =sum1*i;
			
input.close();	
	}
		return sum1;
	
	}
		
	 

	public static void main(String[] args) {
			
		
		int sum1 = 1;
		
		System.out.print("Ievadi skaitļus:");
		
	System.out.println("\nIznakums:"+summa(sum1));
	
	}
	
	
}
