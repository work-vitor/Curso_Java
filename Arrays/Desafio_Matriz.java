package Arrays;

import java.util.Scanner;

public class Desafio_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int a = 0;
		double media = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o número de total de alunos:");
		a = in.nextInt();
		
		System.out.print("Informe o número de total de notas:");
		n = in.nextInt();
		
		double[][] classe = new double[a][n];
		
		//Entrada de dados
		for (int i = 0; i < classe.length; i++) {
			for (int j = 0; j < classe[n].length; j++) {
				System.out.printf("\nAluno %d - Informe a nota %d: ", i+1, j+1);
				classe[i][j] = in.nextDouble();
				media += classe[i][j];
			}
		}
		
		in.close();
		
		
		media = media/ (n*a);
		
		System.out.printf("\nMedia final da turma: %.1f", media);
		
		
	}

}
