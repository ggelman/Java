package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe04 {
	
	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");

		int idade = 0, somaIdade = 0, quant50 = 0, quantIdade = 0, quantAzul = 0, quantRuiva = 0;
		double peso = 0, altura = 0;
		char corOlho, corCabelo;

		for (int cont = 0; cont < 3; cont++) {
			System.out.println("Digite a sua idade: ");
			idade = e.nextInt();
			System.out.println("Digite a sua altura: ");
			altura = e.nextDouble();
			System.out.println("Digite o seu peso: ");
			peso = e.nextDouble();

			System.out.println("Cor dos olhos -> [A] Azul; [V] Verde; [C] castanho");
			System.out.println("Digite a cor dos seus olhos: ");
			corOlho = e.next().toUpperCase().charAt(0);
			while (!(corOlho == 'A') && !(corOlho == 'V') && !(corOlho == 'C') && !(corOlho == 'C')) {
				System.out.println("Digite a cor dos olhos corretamente: ");
				corOlho = e.next().toUpperCase().charAt(0);
			} 

			System.out.println("Cor dos cabelos -> [P] Preto; [C] Castanho; [L] Louro; [R] Ruivo");
			System.out.println("Digite a cor dos cabelos: ");
			corCabelo = e.next().toUpperCase().charAt(0);
			while (!(corCabelo == 'P') && !(corCabelo == 'C') && !(corCabelo == 'L') && !(corCabelo == 'R')) {
				System.out.println("Digite a cor dos cabelos corretamente: ");
				corCabelo = e.next().toUpperCase().charAt(0);
			} 

			if (idade > 50 && peso < 60) {
				quant50++;
			}
			if (altura < 1.50) {
				quantIdade++;
				somaIdade += idade;
			}
			if (corOlho == 'A') {
				quantAzul++;
			}
			if (corCabelo == 'R' && !(corOlho == 'A')) {
				quantRuiva++;
			}

		}

		System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: " + quant50);

		if (!(quantIdade == 0)) {
			System.out
					.println("A média das idades das pessoas com a altura inferior a 1.50: " + somaIdade / quantIdade);
		} else {
			System.out.println("A média das idades das pessoas com a altura inferior a 1,50: 0");
		}

		System.out.println("A porcentagem de pessoas com os olhos azuis entre todas as pessoas analisadas: "
				+ fP.format((double) quantAzul / 10));
		System.out.println("A quantidade de pessoas ruivas que não possuem olhos azuis: " + quantRuiva);

	}

}
