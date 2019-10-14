package lv.jak.artjoms.klases.gramats;

public class MainClass {

	public static void main(String[] args) {
			
		Gramata Gramata = new Gramata();
		Gramata.Autors = "Autors";
		Gramata.GramatasNousaukums = "Balta Nave";
		Gramata.Zanrs = "Kriminalromans"; 
		Gramata.Izdevnieciba = "Zvaigzne abc";
		Gramata.gads = 2018 ;
		
		Autors Autors = new Autors();
		
		Autors.vards ="Roberts"; 
		Autors.Uzvards = "Galbraits";
		Autors.DzimsanasGads = 1971;
		Autors.Tautiba = "Anglis"; 
		
		Zanrs Zanrs = new Zanrs();
		
		Zanrs.Nosaukums = "Kriminalromans";
		
		Izdevnieciba Izdevnieciba = new Izdevnieciba();
		
		Izdevnieciba.Nosaukums = "Zvaigzne abc";
		
		System.out.println("Gramatas dati"); 
		System.out.println("Autors:"+Gramata.Autors);
		System.out.println("Gramatas Nousaukums:"+Gramata.GramatasNousaukums);
		System.out.println("Žanrs:"+Zanrs.Nosaukums);
		System.out.println("Izdevniecība:"+Gramata.Izdevnieciba);
		System.out.println("Gads:"+Gramata.gads);
	}

}
