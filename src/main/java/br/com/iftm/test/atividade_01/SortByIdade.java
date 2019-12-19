package br.com.iftm.test.atividade_01;

import java.util.Comparator;

public class SortByIdade implements Comparator<Paciente> {

	public int compare(Paciente o1, Paciente o2) {
		if (o1.getIdade() > o2.getIdade()) {
			return -1;
		}
		
		if (o1.getIdade() < o2.getIdade()) {
			return 1;
		}
		
		return 0;
	}

}
