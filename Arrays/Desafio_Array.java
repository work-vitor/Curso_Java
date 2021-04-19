package Arrays;

import java.util.Scanner;

public class Desafio_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tm = 0;
		double media = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o número de total de notas:");
		tm = in.nextInt();
		
		double[] notas = new double[tm];
		
		//Entrada de dados
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("\nInforme a nota %d: ", i+1);
			notas[i] = in.nextDouble();
		}
		
		in.close();
		
		
		for (double d : notas) {
			media += d;
		}
		
		media = media/notas.length;
		
		System.out.printf("\nMedia final: %.2f", media);
		
	}

}
