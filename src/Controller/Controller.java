package Controller;

import java.util.ArrayList;
import java.util.Collections;

import Archive.ManipuladorDeArquivo;
import Model.Aluno;
import Model.AlunoHandler;

public class Controller {

	private ArrayList<String> cursos;

	public Controller() {

		this.cursos = new ArrayList<String>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		for (String aux : ManipuladorDeArquivo.lerDoArquivo("lista.csv")) {

			aux = aux.replaceAll("\"", "");

			String[] tokens = aux.split(";", -1);

			if (!cursos.contains(tokens[6])) {
				cursos.add(tokens[6]);
			}

			tokens[16] = tokens[16].replaceAll(",", ".");

			Aluno novoAluno = new Aluno(tokens[6], tokens[11], tokens[12], tokens[16]);

			alunos.add(novoAluno);

		}

		Collections.sort(alunos);
		Collections.reverse(alunos);
		Collections.sort(cursos);

		for (String curso : cursos) {
			ArrayList<Aluno> aux = new ArrayList<Aluno>();
			for (Aluno aluno : alunos) {
				if (aluno.getCurso().equals(curso)) {
					aux.add(aluno);
				}

			}

			AlunoHandler.getHandler().addAlunos(curso, aux);
		}

	}

	public void imprimirCursos() {

		System.out.println("\t\tCursos Disponiveis: \n");

		int index = 0;

		for (String curso : cursos) {
			System.out.println(index + "-" + curso);
			index++;
		}
	}

	public void imprimeAlunos(int index) {

		for (Aluno aluno : AlunoHandler.getHandler().getAlunos(cursos.get(index))) {
			System.out.println(aluno);
		}

	}

}