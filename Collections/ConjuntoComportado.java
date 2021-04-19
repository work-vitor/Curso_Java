package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class ConjuntoComportado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// <> -> Serve para informar qual tipo de dados esse conjunto vai ser.
		//Set<String> lista = new HashSet<String>();
		//TreeSet<String> lista = new TreeSet<String>();//
		SortedSet<String> lista = new TreeSet<>();//SortedSet -> Ordem alfabetica
		
		
		lista.add("Joao");
		lista.add("Maria");
		lista.add("Carlos");
		lista.add("Jose");
		
		
		for (String string : lista) {
			System.out.println(string);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
	}

}
