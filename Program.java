package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] fileLines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String filePath = "/mnt/SSD-1TB/Workspaces-Programacao/ws-eclipse/curso_programacao/src/arquivos/out.txt";
		
		// Objeto FileWriter sem o segundo parâmetro com valor true RECRIA o arquivo
		// ao invés de acrescentar informação no mesmo (aqui acrescenta):
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
			for (String fileLine : fileLines) {
				bufferedWriter.write(fileLine);
				bufferedWriter.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
