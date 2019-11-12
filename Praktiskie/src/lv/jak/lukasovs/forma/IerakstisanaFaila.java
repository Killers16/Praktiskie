package lv.jak.lukasovs.forma;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IerakstisanaFaila {

		
	public static void writeToFile(String fileName, String text) {
		File file = new File(fileName);
		
		FileWriter fw;
		try {
			if (!file.exists())
				file.createNewFile();
			
			fw = new FileWriter(file, true);
			fw.write(text);
			fw.flush();

			fw.close();
			System.out.println("Fails veiksmigi izveidots");
		} catch (IOException e) {
			System.out.println("Fails nav izveidots");
			System.out.println("Skatit kļudas pazinojumu");
			e.printStackTrace();
		}
	}
	
	public String readFile(String fileName) {
		File file = new File(fileName);

		

		String text = "";
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = null;

			while ((line = br.readLine()) != null) {
				text += line + "\n";
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.print("Nav izveleta faila!");
			e.printStackTrace();

		} catch (IOException e) {

			System.out.print(" izveleto failu nav izdevies nolasit!");
			e.printStackTrace();
		}

		return text;

	}

		
}