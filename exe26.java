package fiap;

import java.util.Scanner;

public class exe26 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		String[] nome = new String[5];
		double[] media = new double[nome.length];
		String aux_nome;
		double aux_media;
		int i, j;

		// entrada de dados
		for (i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome do aluno ");
			nome[i] = e.nextLine();
			System.out.println("Digite a média do aluno ");
			media[i] = e.nextDouble();
			e.nextLine();
		}

		// imprime os dados antes da ordenação das notas
		System.out.println("Antes da ordenação:");
		for (i = 0; i < nome.length; i++) {
			System.out.print(nome[i] + "\t\t\t" + media[i] + "\n");
		}

		// ordenação dos dados
		for (j = 0; j < nome.length; j++)
			for (i = 0; i < media.length - 1; i++) {
				if (media[i] > media[i + 1]) {
					// inverte as médias
					aux_media = media[i];
					media[i] = media[i + 1];
					media[i + 1] = aux_media;

					// inverte os nomes
					aux_nome = nome[i];
					nome[i] = nome[i + 1];
					nome[i + 1] = aux_nome;
				}
			}
		// imprime os dados após a ordenação
		System.out.println("\nDepois da ordenação:");
		for (i = 0; i < nome.length; i++) {
			System.out.print(nome[i] + "\t\t\t" + media[i] + "\n");
		}

	}

}
