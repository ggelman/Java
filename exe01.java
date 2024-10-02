package fiap;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// VARIÁVEIS
		String nome;
		double altura = 0, peso = 0, somaAlt = 0;
		int idade = 0, cont50 = 0, contAlt = 0;

		// ESTRUTURA DE REPETIÇÃO
		for (int cont = 0; cont < 3; cont++) {

			System.out.print("Digite o nome: ");
			nome = entrada.next();
			System.out.print("Digite a altura: ");
			altura = entrada.nextDouble();
			System.out.print("Digite o peso: ");
			peso = entrada.nextDouble();
			System.out.print("Digite a idade: ");
			idade = entrada.nextInt();

			// idade superior 50 anos
			if (idade > 50) {
				cont50++;
			}

			// média altura das pessoas com idade 10 - 20
			if (idade > 10 && idade < 20) {
				contAlt++;
				somaAlt += altura; // soma altura pessoas com idade 10 - 20
			}

		}

		System.out.println("Quantidade de pessoas com a idade superior a 50: " + cont50);
		if (contAlt == 0) {
			System.out.println("Média da altura das pessoas com idade entre 10 e 20:0");
		} else {
			System.out.println("Média da altura das pessoas com idade entre 10 e 20: " + somaAlt / contAlt);
		}

	}

}
