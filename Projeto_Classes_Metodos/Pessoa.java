package Projeto_Classes_Metodos;

public class Pessoa {
	
	String Nome_Pessoa;
	double Peso_Pessoa;
	
	//Construtor Padrão
	Pessoa(String Nome_Pessoa, double Peso_Pessoa){
		this.Nome_Pessoa = Nome_Pessoa;
		this.Peso_Pessoa = Peso_Pessoa;
	}
	
	
	void Comer(double Peso_Comida) {
		this.Peso_Pessoa += Peso_Comida;
	}

}
