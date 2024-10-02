package fiap;

import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int matricula = 0, numeroAula = 0;
		double nota = 0, somaNota = 0, media = 0;

		for (int aluno = 0; aluno < 10; aluno++) {

			System.out.println((aluno + 1) + "º Aluno");

			System.out.println("Número da matrícula: ");
			matricula = e.nextInt();

			for (int prova = 0; prova < 3; prova++) {

				System.out.println("Digite a " + (prova + 1));
				nota = e.nextDouble();
				somaNota += nota;
			}

			System.out.println("Número de aulas: ");
			numeroAula = e.nextInt();

			media = somaNota / 3;

			if (media > 6 && numeroAula < 40) {

			}
		}

	}

}
