package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String filePath = "/mnt/SSD-1TB/Workspaces-Programacao/ws-eclipse/curso_programacao/src/arquivos/in.txt";
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader(filePath);
			// BufferedReader é instanciado a partir de um FileReader:
			bufferedReader = new BufferedReader(fileReader);

			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			}

			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
			// Classe "File" permite acessar um arquivo e suas propriedades:
			/*
			  File file = new File(
			  "/mnt/SSD-1TB/Workspaces-Programacao/ws-eclipse/curso_programacao/src/arquivos/in.txt"
			  ); Scanner sc = null; try
			  {
			  sc = new Scanner(file); while (sc.hasNextLine()) {
			  System.out.println(sc.nextLine()); } } catch (IOException e) {
			  System.out.println("Error: " + e.getMessage()); } finally { if (sc != null) {
			  sc.close(); } }
			*/
			 
	}
}
