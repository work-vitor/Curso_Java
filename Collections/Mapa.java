package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> Usuarios = new HashMap<>();
		
		Usuarios.put(1, "Roberta");
		Usuarios.put(2, "João");
		Usuarios.put(3, "Carlos");
		Usuarios.put(4, "Edu");
		
		System.out.println(Usuarios.size());
		System.out.println(Usuarios.isEmpty());
		
		System.out.println(Usuarios.keySet());//Obtem as chaves
		System.out.println(Usuarios.values());//Obtem os valores
		System.out.println(Usuarios.entrySet());//Obtem as chaves e valores
		System.out.println(Usuarios.containsKey(4));//verifica se existe essa chave 
		System.out.println(Usuarios.containsValue("João"));//verifica se existe esse valor
		
		System.out.println(Usuarios.get(4));//Retorna o valor referente a chave
		
		System.out.println();
		
		//Percorrer as chaves atraves do foreach
		for (Integer chave : Usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println();
		
		//Percorrer os valores atraves do foreach
		for (String chave : Usuarios.values()) {
			System.out.println(chave);
		}
		
		System.out.println();
		
		//Percorrer os valores e chaves ao mesmo tempo
		for(Entry<Integer, String> registro: Usuarios.entrySet()) {
			System.out.print(registro.getKey() + "==>");
			System.out.println(registro.getValue());
			
		}
		
		System.out.println();
		
		System.out.println(Usuarios.remove(4));//Remover atraves da chave
		System.out.println(Usuarios.remove(1, "Roberta"));//Remover atraves da chave e valor
		
	}

}
