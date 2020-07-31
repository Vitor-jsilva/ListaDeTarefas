package listaDeTarefas;

import java.util.Scanner;

public class UI {
	ListaDeTarefa lista = new ListaDeTarefa();
	Scanner teclado = new Scanner(System.in);
	public void menu() {
		int escolha;
		do {
			System.out.println("Escolha a opção desejada:");
			System.out.println("1 - adicionar tarefa\n2- visualizar lista\n3- concluir tarefa\n4- remover tarefa\n5- sair");
			escolha = Integer.parseInt(teclado.nextLine());
			switch (escolha) {
				case 1:lista.adicionaTarefa();break;
				case 2:lista.mostraLista();break;
				case 3:lista.concluirTarefa();break;
				case 4:lista.removerTarefa();break;
				case 5:System.out.print("programa encerrado");break;
				default:System.err.print("número inválido");break;
			}
		}while(escolha != 5);
	}

}
