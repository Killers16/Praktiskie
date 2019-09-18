package CikliskasProgramas_ar_metodi;

import java.util.Scanner;

public class U_1 {
	 public static int summa(int sum){
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
	for(int i=1;i<=x;i++) {
		System.out.print(i+" ");		
				sum = sum+i;
input.close();			
	}
		return sum;
	}
		
	 

	public static void main(String[] args) {
			
		int sum =0;
		
		System.out.print("Ievadi skaitļus:");
		
	System.out.println("\nIznakums:"+summa(sum));
	
	}
	
	
	}

