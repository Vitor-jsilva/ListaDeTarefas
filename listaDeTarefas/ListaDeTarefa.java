package listaDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefa {
	Data data = new Data();
	ArrayList<Tarefa> lista = new ArrayList<Tarefa>();
	Scanner teclado = new Scanner(System.in);
	
	public void adicionaTarefa() {
		Tarefa tarefa = new Tarefa();
		boolean valido = true;
		System.out.println("Digite a tarefa:");
		String novaTarefa = teclado.nextLine();
		
			tarefa.setTarefa(novaTarefa);
			do {
				System.out.println("Digite a data limite da tarefa:\nDia:");
					int dia = Integer.parseInt(teclado.nextLine());
				System.out.println("Mes:");
					int mes = Integer.parseInt(teclado.nextLine());
				System.out.println("Ano:");
					int ano = Integer.parseInt(teclado.nextLine());
					valido = data.validaEntradaData(dia, mes, ano);
				if(valido){
				data.setData(dia, mes, ano);
				}else {
					System.err.print("data invalida");
				}
			}while(!valido);
	    lista.add(tarefa);
	}
	
	public void mostraLista() {
		for(int i = 0;i<lista.size();i++) {
			 System.out.print(lista.get(i).retornaTarefaCompleta(data.getData()).toString());
		}
	}

	public void concluirTarefa() {
		System.out.print("Escolha a tarefa a concluir a contagem começa de 0:");
		mostraLista();
		int escolha =  Integer.parseInt(teclado.nextLine());
		lista.get(escolha).concluirTarefa();
	}

	public void removerTarefa() {
		System.out.print("Escolha a tarefa a excluir a contagem começa de 0:");
		mostraLista();
		int escolha =  Integer.parseInt(teclado.nextLine());
		lista.remove(escolha);	
	}
	


}
