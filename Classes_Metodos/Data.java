package Classes_Metodos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	//Metodo construtor padrão
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}
	
	//Metodo construtor 
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	String dataFormatada() {
		
		return String.format("%d/0%d/%d", dia, mes, ano);
		
		
	}

}
