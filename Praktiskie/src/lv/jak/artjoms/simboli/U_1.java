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
		System.out.println(text.replace(".",""+",",""));
	}

}
