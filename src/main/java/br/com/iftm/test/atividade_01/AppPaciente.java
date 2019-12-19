package br.com.iftm.test.atividade_01;

import java.util.ArrayList;
import java.util.Collections;

public class AppPaciente {
	
	ArrayList<Paciente> fila = new ArrayList<Paciente>();
	
	public void addPacienteFila(Paciente paciente) {
		fila.add(paciente);
		
		Collections.sort(fila, new SortByIdade());
		Collections.sort(fila, new SortByPriority());
		
	}
	
	public void showPacienteFila() {
		for (Paciente paciente : fila) {
			System.out.println(paciente.toString());
		}
	}

	public static void main(String[] args) {
		AppPaciente app = new AppPaciente();
		app.addPacienteFila(new Paciente(25, "Maria", Risco.VERDE));
		app.addPacienteFila(new Paciente(30, "Marcio", Risco.VERDE));
		app.addPacienteFila(new Paciente(21, "Geraldo", Risco.VERMELHO));
		app.addPacienteFila(new Paciente(22, "Andressa", Risco.AMARELO));
		app.addPacienteFila(new Paciente(70, "Julio", Risco.VERMELHO));
		
		app.showPacienteFila();
	}
}
