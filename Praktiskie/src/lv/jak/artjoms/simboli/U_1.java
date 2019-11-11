package lv.jak.artjoms.simboli;

import java.util.Scanner;




public class U_1 {
	
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		Nolasit nolasit = new Nolasit();
		nolasit.writeToFile("Atbildes");
		String text = "Datorsistēmu tehniķis strādā organizācijās vai pie individuāliem datorlietotājiem,"
				+ " kur sniedz konsultācijas darbā ar datortehniku, "
				+ "programmatūru un biroja tehniku, uzstāda, "
				+ "konfigurē un modernizē datortehniku, "
				+ "vienkāršus datortīklus un programmatūru, "
				+ "novērš kļūmes to darbībā. "
				+ "Brīvi pārvalda biroja lietojumprogrammas dokumentu, "
				+ "aprēķinu tabulu, prezentāciju sagatavošanai, "
				+ "un datorlietotāja darba procesu automatizēšanai, "
				+ "sagatavo un uztur vienkāršas datu bāzes"
				+ " un interneta mājas lapas. "
				+ "Var strādāt patstāvīgi vai darba grupā.";
		
		System.out.println("1.teksta garums.");
		
		System.out.println("Dota teksta garums ir "+text.length()+" Simboli.");
		
		System.out.println("2.Noteikt, vai teksts satur vārdu (programmatūru) – ignorēt lielos burtus");
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
		
		System.out.println("3.Pārveidot tekstu uz maziem burtiem.. ");
		String text3 = text.toLowerCase();
		System.out.println(text3);
		System.out.println();
		System.out.println("4.Noteikt, kurš pēc kārtas simbols ir burts „z”.");
		System.out.println((text.indexOf("z")+1) +". simbols");
		System.out.println();
		System.out.println("5.Noteikt, burta „t” pēdējo indeksu");
		System.out.println(+text.lastIndexOf("t"));
		System.out.println();
		System.out.println("6.Noteikt , kurš ir 26. simbols tekstā ");
		System.out.println(text.charAt(26));
		System.out.println();
		System.out.println("7.Visus burtus „a” aizstāt ar burtu „o”");
		System.out.println(text.replace("a","o"));
		System.out.println();
		System.out.println("8.Noņemt komatus un punktus.");
		System.out.println(text.replace(",","").replace(".",""));
		System.out.println();
		System.out.println("9Noteikt apakšvirknes tekstu,"
				+ " ja apakšvirknes 1. simbola indekss ir 13,"
				+ "\n bet pēdējais apakšvirknes "
				+ "\nsimbols ir teksta 42. simbols "
				+ "\ntekstā:");
		System.out.println(text.substring(13, 43));
		System.out.println();
		System.out.println("10. Sadalīt simbolu virkni pa vārdiem.");
		System.out.println(text.split(text));
		System.out.println();
		System.out.println("11.Atrast garāko vārdu. "
				+ "Ja vairākiem vārdiem vienāds garums, "
				+ "izvadīt tos visus. ");
		System.out.println("11.Uzdevums: Atrast garāko vārdu");
		String teksts6 = text.replace(",", "").replace(".", "");
		String[]vardi = teksts6.split(" ");
		String garakais = "";
		String visiGarakie = "";

		for(String vards : vardi) {
		if(vards.length()>garakais.length()) {
		garakais = vards;
		visiGarakie = vards;
		}
		else if(vards.length()== garakais.length()) {
		visiGarakie+= (" "+ vards);
		}

		}
		System.out.println("Visi garākie vārdi ir: "+visiGarakie);
		System.out.println();
	System.out.println("12.Atrast īsāko vārdu. "
			+ "Ja vairākiem vārdiem vienāds garums, "
			+ "izvadīt tos visus. ");
	/*System.out.println("pedejais vards ir : " 
			+ text.substring (text.lastIndexOf (' '), text.length()));
	*/ //nepareiz
	System.out.println();
	
	System.out.println("13.Noteikt, kuri vārdi sākas ar burtu "
			+ "„K” – ignorēt lielo burtu rakstību. "
			+ "Izvadīt visus tos vārdus.");
	
	String[] burts= text.split(" K");

	 for(int i=0; i<burts.length; i++) {
	   String[] vards = burts[i].split(" ");

	    if( i > 0 ) {
	    	// ignorējiet pārējos vārdus, jo nesācies ar K
	      System.out.println("K" + vards[0]); 
	    }
	else {    //  Pārbaude 1. skaitli
	          for(int j=0; j<vards.length; j++) {

	        if ( vards[j].startsWith("k") || vards[j].startsWith("K"))
	              System.out.println(vards[j]); 
	            }   
	        }

	     }
	 System.out.println("14. Pārveidot vārdu „Datorsistēmu” uz lieliem burtiem");
	 String vards  = "datorsistēmu"; 
	 System.out.println(vards = vards.substring(0,12).toUpperCase() + vards.substring(12).toLowerCase());
	 
	 System.out.println("15. Noteikt, kuri vārdi beidzas ar burtu „s”. Izvadīt visus tos vārdus. (3 punkti)");
	 String[] burts1= text.split(" s");

	 for(int i=0; i<burts1.length; i++) {
	   String[] vards1 = burts1[i].split(" ");

	  
	{    
	          for(int j=0; j<vards1.length; j++) {

	        if ( vards1[j].endsWith("s") || vards1[j].endsWith("s"))
	              System.out.println(vards1[j]); 
	            }   
	        }

	     }

	 
	
	input.close();
	}
	

}
