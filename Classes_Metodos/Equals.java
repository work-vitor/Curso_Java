package Classes_Metodos;



public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "João Vitor";
		u1.email = "jj@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "João Vitor";
		u2.email = "jj@gmail.com";
		
		//Comparação por endereço de memoria
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		
		//System.out.println(u2.equals(new Date()));
		
		
	}
	
}
