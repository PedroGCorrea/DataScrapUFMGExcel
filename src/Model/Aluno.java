package Model;

public class Aluno implements Comparable<Aluno> {

    private String curso, nome, modalidade, nota;

    public Aluno() {
        this.curso = "";
        this.nome = "";
        this.modalidade = "";
        this.nota = "";

    }

    public Aluno(String curso, String nome, String modalidade, String nota) {
        this.curso = curso;
        this.nome = nome;
        this.modalidade = modalidade;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nNota: " + nota + "\n" + "Modalidade: " + modalidade + "\n55";
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno o) {
        if (Float.parseFloat(this.nota) > Float.parseFloat(o.nota)) {
            return 1;
        } else if (Float.parseFloat(this.nota) < Float.parseFloat(o.nota)) {
            return -1;
        } else {
            return 0;
        }
    }

}