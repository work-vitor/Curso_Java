package Classes_Metodos;



//import java.util.Scanner;
public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data dat1 = new Data();
		
		Data dat2 = new Data(9, 1, 2021);
		
		
		String form = dat1.dataFormatada();
		String form2 = dat2.dataFormatada();
		
		
		System.out.println("Data de hoje:" +form);
		System.out.println("\nData de hoje:" +form2);
		
		String a = "";
		
		System.out.print(a.concat("!!!"));
		

		

	}

}

/*
 * System.out.printf("Data de hoje: %d/%d/%d\n", dat.dia, dat.mes, dat.ano);
 * Scanner in = new Scanner(System.in);
 

System.out.print("Digite o dia de hoje:");
dat.dia = in.nextInt();

System.out.print("Digite o mes atual:");
dat.mes = in.nextInt();

System.out.print("Digite o ano atual:");
dat.ano = in.nextInt();

in.close();*/