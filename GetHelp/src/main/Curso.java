package main;

public class Curso{
    private String nome;
    private String disciplina;
    private String nivelDeEnsino;
    int idCurso;
    public Curso(){
        super();
    }
    public Curso(int idCurso, String nome, String disciplina, String nivelDeEnsino) {
        this.idCurso =  idCurso;
        this.nome = nome;
        this.disciplina = disciplina;
        this.nivelDeEnsino = nivelDeEnsino;
    }

    public String getNome() {
        return nome;
    }

    public int getIdCurso() {
        return idCurso;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public String getNivelDeEnsino() {
        return nivelDeEnsino;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void seIdAula(int idAula) {
        this.idCurso = idAula;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void setNivelDeEnsino(String nivelDeEnsino){
        this.nivelDeEnsino = nivelDeEnsino;
    }
    public String print() {
		return "Nome:" + nome + " ID:" + idCurso + " Disciplina:" + disciplina + " Nivel de Ensino:" + nivelDeEnsino;
	}


}
