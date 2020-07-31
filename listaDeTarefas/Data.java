package listaDeTarefas;

public class Data {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(int dia,int mes, int ano) {
			this.data = dia+"/"+mes+"/"+ano;
	}
	
	public boolean validaEntradaData(int dia,int mes, int ano){
		if(dia>31 || dia<1 || mes<1 || mes>12 || ano<2020) {
			return false;
		}else {
			return true;
		}
	}
}
