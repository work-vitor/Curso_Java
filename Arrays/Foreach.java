package Arrays;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double []  notas = {9.9, 8.6, 7.2, 9.5};
		
		for (double nota : notas) {
			System.out.println(nota);
		}
		
		double[] notasAluno = new double[3];
		
		notasAluno[0] = 5.50;
		notasAluno[1] = 7;
		notasAluno[2] = 8.9;
		int i = 0;
		
		for (double d : notasAluno) {
			i++;
			System.out.printf("\nNota %d : %.2f", i, d );
		}
		
	}

}
