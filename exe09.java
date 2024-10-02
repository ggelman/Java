package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe09 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ #0.00");

		double precoCarro = 0, total = 0;
		int perc = 0;

		System.out.print("Digite o valor do carro: ");
		precoCarro = e.nextDouble();

		System.out.println("O preço final à vista com desconto de 20%:" + precoCarro * 0.80);

		// repetição parcelamento
		for (int parc = 6; parc < 66; parc += 6) {

			perc += 3;
			total = precoCarro + (precoCarro * perc / 100);
			System.out.println("O preço final parcelado em " + parc + " X é de " + fM.format(total)
					+ " com parcelas de " + fM.format(total / parc));
		}

	}

}
