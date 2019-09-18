package lv.jak.artjoms.klaes;

public class MainClass {

	public static void main(String[] args) {
		//1.Skolotaja objekta izveide
		Skolotajs Skolotajs = new Skolotajs();
		Skolotajs.vards = "Aigars";
		Skolotajs.Uzvards = "Ašaks";
		Skolotajs.Dzimums = "Virietis";
		Skolotajs.Vecums = 28;
		//2.Kursa objekta izveide
		Kurss Kurss = new Kurss();
		
		Kurss.KursaNosaukums = "2.p";
		Kurss.audzinatajs = Skolotajs;
		Kurss.audzeknuSkaits = 20;
		Kurss.videjaisVertejums = 6.3;
		Kurss.programma = "Programetaji";
		
		//3.Audzekņa objekta izveide
		 Audzeknis  Audzeknis = new  Audzeknis();
		 Audzeknis.Vards = "Artjoms";
		 Audzeknis.Uzvards = "Lukašovs";
		 Audzeknis.Vecums = 17;
		 Audzeknis.kurss = Kurss;
		 Audzeknis.Dzimums = "Virietis";
		 Audzeknis.videjaisVertejums = 6.8;
		 Audzeknis.dzivoKojas = false;
		 
		
		System.out.println("Audzekņa dati"); 
		System.out.println("Vards:"+Audzeknis.Vards);
		System.out.println("Uzvards:"+Audzeknis.Uzvards);
		System.out.println("Vecums:"+Audzeknis.Vecums);
		System.out.println("Kurss:"+Audzeknis.kurss.KursaNosaukums);
		System.out.println("Dzimums:"+Audzeknis.Dzimums);
		System.out.println("Videjais vertejums:"+Audzeknis.videjaisVertejums);
		System.out.println("DzivoKojas:"+Audzeknis.dzivoKojas);
		System.out.println("Audzinatajs:"+Audzeknis.kurss.audzinatajs.vards);		
				 
		 
	}

}
