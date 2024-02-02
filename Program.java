package arquivos;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String stringPath = sc.nextLine();
		
		// Um objeto File pode apontar tanto para um arquivo quanto para uma pasta:
		File filePath = new File(stringPath);
		
		/*
		 *  Método listFiles() recebe filtro de busca como parâmetro.
		 *	"File::isDirectory é uma função que filtra pastas:
		 */
		File[] foldersInPath = filePath.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS IN THE TYPED PATH:");
		System.out.println();
		for (File folder : foldersInPath) {
			System.out.println(folder);
		}
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		File[] filesInPath = filePath.listFiles(File::isFile);
		
		System.out.println("FILES IN THE TYPED PATH:");
		System.out.println();
		for (File file : filesInPath) {
			System.out.println(file);
		}
		
		System.out.println();
		boolean successfulFolderCreation = new File(stringPath + "/teste").mkdir();
		System.out.println("Directory created successfully: " + successfulFolderCreation);
		System.out.println("PATH OF NEW FOLDER: " + stringPath + "/teste");
		
		sc.close();
		
	}
}
