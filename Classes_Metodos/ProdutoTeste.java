package Classes_Metodos;


public class ProdutoTeste {
	
	public static void main(String[] arg) {
		
		Produto p1 = new Produto("Computador", 4000.88);
		
		
		//Produto p1 = new Produto();
		var p2 = new Produto();
		p2.nome_Prod = "Lapis";
		p2.preco = 10.50;
		
		//Casso o padrão de desconto mude
		//deve ser alterado dessa forma
		//Produto.desconto = 0.30;
		
		System.out.println("Loja: " +Produto.nome_loja);
		
		double desconto1 = p1.precoComDesconto();
		double desconto2 = p2.precoComDesconto(0.10);//metodo com desconto do gerente
		
		System.out.printf("Produto: %s - com desconto de: R$%.2f = R$%.2f", p1.nome_Prod, Produto.desconto, desconto1);
		System.out.printf("\nProduto: %s - com desconto de: R$%.2f = R$%.2f", p2.nome_Prod, Produto.desconto, desconto2);
		
		
	}

}
