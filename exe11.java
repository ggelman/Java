package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe11 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");

		int idade = 0, cont = 0, somaIdade = 0;
		char op;
		double contA = 0, contB = 0, contC = 0, contD = 0, contE = 0, mediaIdade = 0;

		System.out.println("Informe sua idade: ");
		idade = e.nextInt();

		while (!(idade == 0)) {
			System.out.println("Ótimo [A]; Bom [B]; Regular [C]; Ruim [D]; Péssimo [E]");
			System.out.println("Informe sua opinião:");
			op = e.next().toUpperCase().charAt(0);
			while (!(op == 'A') && !(op == 'B') && !(op == 'C') && !(op == 'D') && !(op == 'E')) {
				System.out.println("Informe sua opinião: A/B/C/D/E: ");
				op = e.next().toUpperCase().charAt(0);
			}

			if (op == 'A') {
				contA++;
			} else {
				if (op == 'B') {
					contB++;
				} else {
					if (op == 'C') {
						contC++;
					} else {
						if (op == 'D') {
							contD++;
						} else {
							contE++;
						}
					}
				}
			}

			cont++;
			somaIdade += idade;

			System.out.println("Digite sua idade:");
			idade = e.nextInt();
		}

		if (cont != 0) {
			mediaIdade = somaIdade / cont;

			System.out.println("Quantidade de pessoas que responderam a pesquisa: " + cont);
			System.out.println("Média da idade dos usuários: " + mediaIdade);
			System.out.println("Porcentagem A: " + fP.format((double) contA / cont));
			System.out.println("Porcentagem B: " + fP.format((double) contB / cont));
			System.out.println("Porcentagem C: " + fP.format((double) contC / cont));
			System.out.println("Porcentagem D: " + fP.format((double) contD / cont));
			System.out.println("Porcentagem E: " + fP.format((double) contE / cont));
		}

	}

}
