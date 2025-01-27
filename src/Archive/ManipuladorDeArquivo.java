package Archive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorDeArquivo {

	public static void escreverNoArquivo(String caminho, String texto) {
		File file = new File(caminho);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(texto);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void escreverNoArquivo(String caminho, List<String> texto) {
		File file = new File(caminho);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			for (String lines : texto) {

				bw.write(lines);
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<String> lerDoArquivo(String caminho) {
		File file = new File(caminho);
		List<String> lista = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				//System.out.println(line);
				lista.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}

}