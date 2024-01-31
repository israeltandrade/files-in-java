package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Classe "File" permite acessar um arquivo e suas propriedades:
		File file = new File(
				"/mnt/SSD-1TB/Workspaces-Programacao/ws-eclipse/curso_programacao/src/arquivos/in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
