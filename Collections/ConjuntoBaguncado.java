package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//Adicionar elementos ao conjunto
		conjunto.add(1.2);//double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('q');
		
		//Size é usado para saber o tamnho da collection
		System.out.println("Tamanho é " +conjunto.size());
		
		//Remover elementos do conjunto
		conjunto.remove("Teste");
		System.out.println("Tamanho é " +conjunto.size());
		
		//Verificar se contem um determinado elemento
		System.out.println(conjunto.contains(1.2));
		System.out.println(conjunto.contains("Teste"));
		
		
		
		Set numSet = new HashSet();
		
		
		numSet.add(1);
		numSet.add(2);
		numSet.add(3);
		
		System.out.println(numSet);
		System.out.println(conjunto);
		
		//conjunto.addAll(numSet);//Uniao entre dois conjuntos
		conjunto.retainAll(numSet);
		System.out.println(conjunto);
		
		conjunto.clear();//Limpar o conjunto
		System.out.println(conjunto);
		
	}
}
