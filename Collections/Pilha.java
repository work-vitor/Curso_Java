package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ultimo a entrar/primeiro a sair
		//primeiro a entrar/ultimo a sair
		Deque<String> livros = new ArrayDeque<String>();
		
		//Adicionar
		livros.add("O pequeno");
		livros.push("Don Quixote");
		livros.push("Demo nono");
		
		System.out.println(livros.size());//Tamanho da fila
		
		System.out.println();
		
		System.out.println(livros.peek());//ultimo a entrar
		System.out.println(livros.peekLast());//primeiro a entrar
		
		System.out.println();
		
		System.out.println(livros.poll());//vai remover o ultimo a entrar
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		System.out.println();
		
		System.out.println(livros.size());//Tamanho da fila
		System.out.println(livros.isEmpty());//Veefica se a lista esta vazia
		//fila.clear(); limpa a lista
		
		
		
	}

}
