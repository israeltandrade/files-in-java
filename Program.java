package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String filePath = "/mnt/SSD-1TB/Workspaces-Programacao/ws-eclipse/curso_programacao/src/arquivos/in.txt";
		/*
		 * // Declaração fica obsoleta com uso de "try with resources": FileReader
		 * fileReader = null; BufferedReader bufferedReader = null;
		 */

		// Bloco "try with resources":
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// Bloco finally obsoleto com try with resources:
		/*
		 * finally { try { if (bufferedReader != null) { bufferedReader.close(); } if
		 * (fileReader != null) { fileReader.close(); } }
		 * 
		 * catch (IOException e) { e.printStackTrace(); } }
		 */

		// Classe "File" permite acessar um arquivo e suas propriedades:
		/*
		 * File file = new File(
		 * "/mnt/SSD-1TB/Workspaces-Programacao/ws-eclipse/curso_programacao/src/arquivos/in.txt"
		 * ); Scanner sc = null; try { sc = new Scanner(file); while (sc.hasNextLine())
		 * { System.out.println(sc.nextLine()); } } catch (IOException e) {
		 * System.out.println("Error: " + e.getMessage()); } finally { if (sc != null) {
		 * sc.close(); } }
		 */

	}
}
