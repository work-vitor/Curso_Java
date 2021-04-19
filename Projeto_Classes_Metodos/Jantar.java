package Projeto_Classes_Metodos;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa humano = new Pessoa("João Vitor", 65.48);
		
		Comida ref1 = new Comida("Batata", 0.600);
		Comida ref2 = new Comida("Bife", 5.1);
		
		
		
		//Refeição 1
		System.out.println("Nome da comida 1: " +ref1.Nome_Comida);
		System.out.println("Peso da comida 1: " +ref1.Peso_Comida);
		System.out.printf("Pesso do %s antes da refeição: %.2f", humano.Nome_Pessoa, humano.Peso_Pessoa);
		humano.Comer(ref1.Peso_Comida);
		System.out.printf("\nPesso do %s após a refeição: %.2f\n\n", humano.Nome_Pessoa, humano.Peso_Pessoa);
		 
		//Refeição 2
		System.out.println("Nome da comida 2: " +ref2.Nome_Comida);
		System.out.println("Peso da comida 2: " +ref2.Peso_Comida);
		System.out.printf("Pesso do %s antes da refeição: %.2f", humano.Nome_Pessoa, humano.Peso_Pessoa);
		humano.Comer(ref2.Peso_Comida);
		System.out.printf("\nPesso do %s após a refeição: %.2f\n", humano.Nome_Pessoa, humano.Peso_Pessoa);
		
		

	}

}
