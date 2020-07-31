package listaDeTarefas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class tarefaTeste {

	Data data = new Data();
	Tarefa tarefa = new Tarefa();
	ListaDeTarefa lista = new ListaDeTarefa();
	//Data
	@Test
	public void validaGetterSetterData() {
		int dia = 10;
		int mes = 6;
		int ano = 2020;
		data.setData(dia,mes,ano);
		assertTrue(data.getData().equals("10/6/2020"));
	}
	@Test
	public void validaEntradaDataTrue() {
		assertTrue(data.validaEntradaData(12, 10, 2020));
	}
	@Test
	public void validaEntradaDataFalse() {
		assertFalse(data.validaEntradaData(32, 13, 2012));
	}
	
	//Tarefa
	
	@Test
	public void validaEntradaTarefaTrue() {
		tarefa.setTarefa("ir a academia");
		assertTrue(tarefa.getTarefa().equals("ir a academia"));
	}
	@Test
	public void validaEntradaTarefaFalse() {
		tarefa.setTarefa("Entregar a atividade de ITDD");
		assertFalse(tarefa.getTarefa().equals("ir ao mercado"));
	}
	@Test
	public void validaStatus() {
		tarefa.concluirTarefa();
		assertTrue(tarefa.isStatus().equals("Concluida"));
	}
	@Test
	public void validaStatusFalse() {
		assertTrue(tarefa.isStatus().equals("Pendente"));
	}
	@Test
	public void validaAdicionaTarefa() {
		ArrayList<Tarefa> lista = new ArrayList<Tarefa>();
		int dia = 10,mes = 6, ano = 2025;
		data.setData(dia, mes, ano);
		tarefa.setTarefa("ir ao mercado");
	    lista.add(tarefa);
	   assertTrue(lista.get(0).retornaTarefaCompleta(data.getData()).equals("tarefa: ir ao mercado\nData limite: 10/6/2025\nstatus: Pendente\n\n"));
	}
	

}
