package Model;

import java.util.ArrayList;
import java.util.Hashtable;

public class AlunoHandler {

    private Hashtable<String, ArrayList<Aluno>> alunos;

    static AlunoHandler handler;

    private AlunoHandler() {
        alunos = new Hashtable<String, ArrayList<Aluno>>();
    }

    public static AlunoHandler getHandler() {
        if (handler == null) {
            handler = new AlunoHandler();
        }
        return handler;

    }

    public ArrayList<Aluno> getAlunos(String curso) {

        return alunos.get(curso);
    }

    public void addAlunos(String curso, ArrayList<Aluno> aux) {
        alunos.put(curso, aux);
    }

}
