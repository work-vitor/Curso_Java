package Classes_Metodos;

public class AreaCirc {

	
	double raio;
	final static double PI = 3.141592;
	
	AreaCirc(double raioInicial){
		
		raio = raioInicial;
		
	}
	
	double Area() {
		return raio * raio * PI;
	}
	
}
