package main;

public class Professor extends Usuario{
	private double nota;
    private int quantidadeNotas;
    private String nivelDeEnsino;
    private String certificado;
	
	public Professor() {
		super();
	}

	public Professor(String nome, int cpf, String email, int idade, double nota, int quantidadeNotas, String nivelDeEnsino, String certificado) {
		super(nome, cpf, email, idade);
		this.nota = nota;
		this.quantidadeNotas = quantidadeNotas;
		this.nivelDeEnsino = nivelDeEnsino;
		this.certificado = certificado;
	}
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
    
    public int getQuantidadeNotas() {
        return quantidadeNotas;
    }

    public void setQuantidadeNotas(int quantidadeNotas) {
        this.quantidadeNotas = quantidadeNotas;
    }

    public String getNivelDeEnsino() {
		return nivelDeEnsino;
	}

	public void setNivelDeEnsino(String nivelDeEnsino) {
		this.nivelDeEnsino = nivelDeEnsino;
	}

    public String getCertificado() {
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

    public String print() {
		return "Nome:" + nome + " CPF:" + cpf + " Email:" + email + " Idade:" + idade + " Nota:" + nota + " Nivel de Ensino:" + nivelDeEnsino;
	}

	public void adicionarNota(float novaNota) {
        this.quantidadeNotas = this.quantidadeNotas + 1;
		this.nota = (this.nota + novaNota) / this.quantidadeNotas;
	}
}