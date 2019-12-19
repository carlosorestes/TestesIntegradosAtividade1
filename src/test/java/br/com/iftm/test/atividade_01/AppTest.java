package br.com.iftm.test.atividade_01;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private AppPaciente appPaciente;
	
	@Before
	public void init() {
		appPaciente = new AppPaciente();
	}
	
	@Test
	public void testFila() throws FilaException {
		
		appPaciente.addPacienteFila(new Paciente(21, "Geraldo", Risco.VERMELHO));
		appPaciente.addPacienteFila(new Paciente(70, "Julio", Risco.VERMELHO));
		appPaciente.addPacienteFila(new Paciente(25, "Maria", Risco.VERDE));
		appPaciente.addPacienteFila(new Paciente(30, "Marcio", Risco.VERDE));
		appPaciente.addPacienteFila(new Paciente(22, "Andressa", Risco.AMARELO));
		
		assertEquals("Julio", appPaciente.fila.get(0).getNome());
		assertEquals("Geraldo", appPaciente.fila.get(1).getNome());
		assertEquals("Andressa", appPaciente.fila.get(2).getNome());
		assertEquals("Marcio", appPaciente.fila.get(3).getNome());
		assertEquals("Maria", appPaciente.fila.get(4).getNome());
	}
   
}
