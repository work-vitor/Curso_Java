package Arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAluno = new double[3];
		
		
		notasAluno[0] = 5.50;
		notasAluno[1] = 7;
		notasAluno[2] = 8.9;
		
		System.out.println(Arrays.toString(notasAluno));
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.printf("\nNota %d = %.2f", i+1, notasAluno[i]);
		}
		
		System.out.println();
		
		double[] notasAlunoB = {7.8, 8.5, 6.7};
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			System.out.printf("\nNota %d = %.2f", i+1, notasAlunoB[i]);
		}
		
	}
}
