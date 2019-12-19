package br.com.iftm.test.atividade_01;

public enum Risco {
	VERMELHO(1),
	AMARELO(2),
	VERDE(3);
	
	public final Integer value;
	
	Risco(final Integer value){
		this.value = value;
	}
}
