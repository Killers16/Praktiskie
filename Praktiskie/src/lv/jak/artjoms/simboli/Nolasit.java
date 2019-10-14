package lv.jak.artjoms.simboli;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Nolasit {

	public void writeToFile(String fileName ) {
		File file = new File(fileName);
		
		
		FileWriter fw ;
		try {
			if(!file.exists()) 
			file.createNewFile();
			//FileWriter objekts katru reizi parrakstis datnes saturu
			//fw 	= new FileWriter(file);
			
			//FileWriter objekts katru reizi papildinas  datnes saturu
			//true - norada ka datnes saturu ir japapildina(parametrs APPEND
			//fw 	= new FileWriter(file,true);
			
		fw 	= new FileWriter(file,true);
		fw.write("");
		String text = "";
		fw.write(text+"\n");
		fw.flush();
		
		fw.close();
		System.out.println("Fails veiksmigi izveidots");
		} catch (IOException e) {
			System.out.println("Fails nav izveidots");
			System.out.println("Skatit kļudas pazinojumu");
			e.printStackTrace();
		}
	}
	
	}

