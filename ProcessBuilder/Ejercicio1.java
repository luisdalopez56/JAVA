package ProcessBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) throws IOException {
		
		ProcessBuilder processBuilder = new ProcessBuilder("ls");
		Process process = processBuilder.start();
		
		Scanner scanner = new Scanner(process.getInputStream());
		
		while(scanner.hasNext()) {
			
			System.out.println("Ls process: " + scanner.next());
			
		}
		scanner.close();
	}

}
