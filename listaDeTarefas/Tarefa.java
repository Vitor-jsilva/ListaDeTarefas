package listaDeTarefas;

public class Tarefa {

	private String descricaoTarefa;
	private boolean status = false;
	
	public String getTarefa() {
		return descricaoTarefa;
	}

	public void setTarefa(String tarefa) {
		this.descricaoTarefa = tarefa;
	}
	
	public String retornaTarefaCompleta(String data) {
		return "tarefa: "+descricaoTarefa+"\nData limite: "+data+"\nstatus: "+isStatus()+"\n\n";
	}
	public String isStatus() {
		if(status) {
			return "Concluida";
		}else {
			return "Pendente";
		}
	}
	public void concluirTarefa() {
		status = true;
	}
}
