package lv.jak.lukasovs.forma;

public class MainClass {

	public static void main(String[] args) {
		FormaElektriba elektriba = new FormaElektriba();
		elektriba.setVisible(true);
		
		
		FailaNolasisana.readFile("Formas.txt");
		IerakstisanaFaila.writeToFile("Formas.txt", "");
		
	}

}
