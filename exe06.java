package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");

		int voto = 0, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, nulo = 0, branco = 0, cont = 0;

		System.out.println("Digite o voto: ");
		voto = e.nextInt();

		while (!(voto == 0)) {
			switch (voto) {
			case 1:
				cand1++;
				break;
			case 2:
				cand2++;
				break;
			case 3:
				cand3++;
				break;
			case 4:
				cand4++;
				break;
			case 5:
				nulo++;
				break;
			case 6:
				branco++;
				break;
			default:
				System.out.println("Opcão inválida! ");
				cont--;
			}

			cont++;

			System.out.println("Digite o voto: ");
			voto = e.nextInt();

		}

		System.out.println("Candidato 1: " + cand1);
		System.out.println("Candidato 2: " + cand2);
		System.out.println("Candidato 3 : " + cand3);
		System.out.println("Candidato 4: " + cand4);
		System.out.println("Votos nulos: " + nulo);
		System.out.println("Votos em branco: " + branco);
		System.out.println("Porcentagem votos nulos: " + fP.format((double) nulo / cont));
		System.out.println("Porcentagem votos branco: " + fP.format((double) branco / cont));

	}

}
