package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa04 {

	public static void main(String[] args) {
		
		
		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		
		//para criar um aquivo
		String path = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			//lógica pra salvar no arquivo a linha 12
			for(String line : lines) {
				bw.write(line);
				bw.newLine();//para quebra de linha
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
