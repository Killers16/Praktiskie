package lv.jak.artjoms.simboli;

public class U_1 {
	
	public static void main(String[] args) {
		
		String text = "Datorsistēmu tehniķis strādā organizācijās vai pie individuāliem datorlietotājiem,"
				+ " kur sniedz konsultācijas darbā ar datortehniku, "
				+ "programmatūru un biroja tehniku, "
				+ "uzstāda, konfigurē un modernizē datortehniku, "
				+ "vienkāršus datortīklus un programmatūru, "
				+ "novērš kļūmes to darbībā. "
				+ "Brīvi pārvalda biroja lietojumprogrammas dokumentu, "
				+ "aprēķinu tabulu, prezentāciju sagatavošanai, "
				+ "un datorlietotāja darba procesu automatizēšanai, "
				+ "sagatavo un uztur vienkāršas datu bāzes un interneta mājas lapas. "
				+ "Var strādāt patstāvīgi vai darba grupā.";
		
		System.out.println("1teksta garums.");
		
		System.out.println("Dota teksta garums ir "+text.length()+" Simboli.");
		System.out.println("2.vai teksts satur vārdu (programmatūru) – ignorēt lielos burtus");
		String text2 = text.toLowerCase();
		System.out.println("ar IF ELSE");
		System.out.println("Teksts satur vārdu \"programatūru\" :"+text2.contains("programmatūru"));
		
		if(text2.contains("Programaturu")) {
			System.out.println("Teksts satur vārdu \"programmatūru\"");
				}
		else {
			System.out.println("Teksts nesatur vārdu \"programmatūru\"");
		}
		System.out.println();
		
		System.out.println("3.Pārveidot tekstu uz maziem burtiem. ");
		String text3 = text.toLowerCase();
		System.out.println(text3);
		System.out.println();
		System.out.println("4.Noteikt, kurš pēc kārtas simbols ir burts „z”. ");
		System.out.println("Teksta kārtas simbols ir burts \"z\""+(text.indexOf("z")+1) +". simbols");
		System.out.println();
		System.out.println("5.Noteikt, burta „t” pēdējo indeksu");
		System.out.println("burta „t” pēdējo indeksu\"t\""+text.lastIndexOf("t"));
		System.out.println();
		System.out.println("6.Noteikt , kurš ir 26. simbols tekstā. ");
		System.out.println(text.charAt(26));
		System.out.println();
		System.out.println("7.Visus burtus „a” aizstāt ar burtu „o”. ");
		System.out.println("burtus „a” aizstāt ar burtu „o”: "
		+text.replace("a","o"));
		System.out.println();
		System.out.println("8.Noņemt komatus un punktus");
		System.out.println(text.replace(",","").replace(".",""));
		System.out.println();
		System.out.println("9.Noteikt apakšvirknes tekstu,"
				+ " ja apakšvirknes 1. simbola indekss ir 13, "
				+ "bet pēdējais apakšvirknes simbols ir teksta 42. simbols tekstā. ");
		System.out.println(text.substring(13, 43));
		System.out.println();
		System.out.println("10. Sadalīt simbolu virkni pa vārdiem");
		System.out.println(text.split(text));
		System.out.println();
		System.out.println("11.Atrast garāko vārdu. "
				+ "Ja vairākiem vārdiem vienāds garums, izvadīt tos visus ");
		String text11 = text.replace(",", "");
		text11 = text.replace(".", "");
		
		String[] vardi11 = text.split("");
		String garakais="";
		String visiGarakie="";
		 
		for(String vards : vardi11) {
			 if(vards.length()>garakais.length()) {
				 garakais = vards;
				 visiGarakie = vards;
			 }
			 else if(vards.length()==garakais.length()) {
				 visiGarakie += ( ","+vards);
			 }
			 
		 }
		System.out.println("Visi garakie vardi ir"+visiGarakie);
	System.out.println();
	System.out.println("12.Atrast īsāko vārdu. "
			+ "Ja vairākiem vārdiem vienāds garums, "
			+ "izvadīt tos visus. ");
	String text12 = text.replace(",", "");
	text12 = text.replace(".", "");
	
	String[] vardi12 = text.split("");
	String isais=vardi12[0];
	String visiIsie=vardi12[0];
	 
	for(String vards1 : vardi12) {
		 if(vards1.length()<isais.length()) {
			isais = vards1;
			 visiIsie = vards1;
		 }
		 else if(vards1.length()==isais.length()) {
			 visiIsie += ( ","+vards1);
		 }
		 
	 }
	System.out.println("Visi isakie vardi ir"+visiIsie);
	System.out.println();
	System.out.println("13.Noteikt, kuri vārdi sākas ar burtu „K” – "
			+ "ignorēt lielo burtu rakstību. "
			+ "Izvadīt visus tos vārdus. ");
	
	
	
	
	
	
	}
	

}
