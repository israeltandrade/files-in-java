package arquivos;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String stringPath = sc.nextLine();
		
		// Um objeto File pode apontar tanto para um arquivo quanto para uma pasta:
		File filePath = new File(stringPath);
		
		System.out.println("getPath: " + filePath.getPath());
		System.out.println("getParent: " + filePath.getParent());
		System.out.println("getName: " + filePath.getName());
		
		sc.close();
		
	}
}
