package fundamentos;
import java.util.Scanner;
public class Do_while01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usu = "ok";
		
		Scanner input = new Scanner(System.in);
		
		do{
			
			System.out.print("\nDigita ai mermao: ");
			usu = input.next();
			
		}while(!usu.equalsIgnoreCase("sair"));
		
		input.close();

	}

}
