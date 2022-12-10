package main;

public class Aluno extends Usuario{
	private int aulasAssitidas;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, int cpf, String email, int idade, int aulasAssitidas) {
		super(nome, cpf, email, idade);
		this.aulasAssitidas = aulasAssitidas;
	}
	
	public int getAulasAssitidas() {
		return aulasAssitidas;
	}
	
	public void setAulasAssitidas(int aulasAssitidas) {
		this.aulasAssitidas = aulasAssitidas;
	}
	
	public String print() {
		return "Nome:" + nome + " CPF:" + cpf + " Email:" + email + " Idade:" + idade + " Aulas Assistidas:" + aulasAssitidas;
	}
	
	public void adicionarAula(int quantidadeAulas) {
		this.aulasAssitidas = aulasAssitidas + quantidadeAulas;
	}
}