package br.com.iftm.test.atividade_01;

import java.util.Comparator;

public class SortByPriority implements Comparator<Paciente> {

	public int compare(Paciente o1, Paciente o2) {
		if (o1.getRisco().value < o2.getRisco().value) {
			return -1;
		}
		
		if (o1.getRisco().value > o2.getRisco().value) {
			return 1;
		}
		
		return 0;
	}
}
