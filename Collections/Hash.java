package Collections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("João"));
		usuarios.add(new Usuario("Maria"));
		usuarios.add(new Usuario("Pedro"));
		
		boolean resu = usuarios.contains(new Usuario("João"));
		
		System.out.print(resu);
		
	}

}
