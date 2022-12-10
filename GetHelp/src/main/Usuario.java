package main;

public class Usuario {
    protected  String nome;
	public  int cpf;
    protected  String email;
    protected  int idade;

	public Usuario() {
	}

	public Usuario(String nome, int cpf, String email, int idade) {
		this.nome = nome;
		this.cpf = cpf;
        this.email = email;
		this.idade = idade;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public String print() {
		return "Nome:" + nome + " CPF:" + cpf + " Email:" + email + " Idade:" + idade ;
	}
	
	public boolean equals(Object obj) {
		Usuario cpf = (Usuario) obj;
		if(this.cpf == cpf.getCpf())
			return true ;
		else
			return false;
	}
}