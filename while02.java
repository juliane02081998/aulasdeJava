package rep01;

import java.util.Scanner;

public class while02 {

	public static void main(String[] args) {
		int alunos = 0, totalalunos;
		double nota =0, soma =0, media =0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("quantos alunos na sala? ");
		totalalunos= alunos;
		alunos = input.nextInt();
		while (alunos >0) {
			System.out.println("informe a nota: ");
			nota = input.nextDouble();
			soma = soma + soma + nota;
			alunos --;
		}
		media = soma/totalalunos;
		System.out.printf("A média da turma é %.2f", media);


	}

}
