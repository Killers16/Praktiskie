package lv.jak.lukasovs.forma;





import java.io.File;
import java.io.FileWriter;
import java.io.IOException;	
	public class IerakstisanaFaila {

			
			public static void writeToFile(String fileName , String text ) {
				File file = new File(fileName);
				
				
				FileWriter fw ;
				try {
					if(!file.exists()) {
						
						file = new File(fileName);
					}
					file.createNewFile();
					
					
				fw 	= new FileWriter(file,true);
				
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
