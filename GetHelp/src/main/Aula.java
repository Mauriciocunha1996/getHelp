package main;

public class Aula {
    private String nome;
    private String disciplina;
    private String nivelDeEnsino;
    int idAula;
    public Aula(){
        super();
    }
    public Aula(int idAula, String nome, String disciplina, String nivelDeEnsino) {
        this.idAula =  idAula;
        this.nome = nome;
        this.disciplina = disciplina;
        this.nivelDeEnsino = nivelDeEnsino;
    }

    public String getNome() {
        return nome;
    }

    public int getIdAula() {
        return idAula;
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
        this.idAula = idAula;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void setNivelDeEnsino(String nivelDeEnsino){
        this.nivelDeEnsino = nivelDeEnsino;
    }
    public String print() {
		return "Nome:" + nome + " ID:" + idAula + " Disciplina:" + disciplina + " Nivel de Ensino:" + nivelDeEnsino;
	}


}
