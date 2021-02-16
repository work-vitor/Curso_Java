package Classes_Metodos;

public class Produto {
	
	static String nome_loja = "Sempre25";
	String nome_Prod;
	double preco;
	static double desconto = 0.25;
	
	//Metodo construtor
	Produto(String nomeInicial, double precoIncial){
		preco = precoIncial;
		nome_Prod = nomeInicial;
	}
	
	//Metodo construtor Padrao
	Produto(){
		
	}
	
	double precoComDesconto(){
		return preco * (1-desconto);
	}
	
	//Metodo para caso haja um desconto adicional
	double precoComDesconto(double descontoDoGerente){
		return preco * (1 -(desconto + descontoDoGerente));
	}

}
