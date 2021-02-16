package Classes_Metodos;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;//Atribuição por valor(primitivo)
		
		a++;
		b--;
		
		System.out.println(a +" -- " +b);
		
		Data d1 = new Data(11, 2, 2021);
		Data d2 = d1;//Atribuição por referência(objeto) - basicamente um ponteiro
					//da linguagem C
		
		d2.dia = 12;
		d2.mes = 3;
		
		d1.ano = 2022;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		
	}

}
