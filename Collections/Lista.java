package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Paulo"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Jose"));
		
		//lista.remove(4);//remover pelo indice
		System.out.println(lista.get(3));
		
		System.out.println();
		
		System.out.println("Foi removido: "+lista.remove(1));
		System.out.println("Removeu "+lista.get(1).nome+"? "+lista.remove(new Usuario("Paulo")));
		System.out.println("tem "+lista.get(2).nome+"? "+lista.contains(new Usuario("João")));
		
		System.out.println();
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
		
		System.out.println();
		
		//Acessar o elemento da lista oelo indice
		System.out.println(lista.get(3));
		
		
		
	}

}
