package aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file); 
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		//pra fechar o scanner
		finally {
			//pra testar se o scanner é diferente de null pra não dar excessões
			if(sc != null) {
				sc.close();
			}
		}
	}

}
