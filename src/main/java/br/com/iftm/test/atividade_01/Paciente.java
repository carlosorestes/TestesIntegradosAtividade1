package br.com.iftm.test.atividade_01;

public class Paciente {
	
	private Integer idade;
	private String nome;
	private Risco risco;
	
	public Paciente(Integer idade, String nome, Risco risco) {
		this.idade = idade;
		this.nome = nome;
		this.risco = risco;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Risco getRisco() {
		return risco;
	}
	public void setRisco(Risco risco) {
		this.risco = risco;
	}

	@Override
	public String toString() {
		return "Paciente [idade=" + idade + ", nome=" + nome + ", risco=" + risco + "]";
	}	
}
