package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um caminho de pasta ou arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] pastas = path.listFiles(File::isDirectory);
		System.out.println("Pastas");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = path.listFiles(File::isFile);
		System.out.println("Pastas");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		//para criar uma subpasta a partir da pasta temp
		boolean sucesso = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso: " + sucesso);
		
		sc.close();

	}

}
