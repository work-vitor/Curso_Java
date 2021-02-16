package Classes_Metodos;

public class AreaCircTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCirc a = new AreaCirc(5.6);
		
		System.out.println(a.Area());
		
		AreaCirc b = new AreaCirc(10);
		
		//Maneira correta de alterar um atributo static
		//AreaCirc.pi = 3.141592;
		
		System.out.println(b.Area());
		
	}

}
