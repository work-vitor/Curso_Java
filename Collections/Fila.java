package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila 
		//Diferença é o comportamento quando a fila está cheia
		
		fila.add("João");
		fila.offer("Carlos");
		fila.add("Jose");
		fila.offer("Maria");
		fila.add("Ananda");
		fila.offer("Bia");
		
		//Peek e Element Retorna primeiro elemento da fila
		//Diferença é o tratamento de erro quando a fila está vazia
		//peek = null - element = erro no console
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println(fila.size());//Tamanho da fila
		System.out.println(fila.isEmpty());//Veefica se a lista esta vazia
		//fila.clear(); limpa a lista
		System.out.println(fila.poll());//Mostra e remove o primeiro elemento da lista
		
		
		
	}

}
