package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe07 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");

		int idade = 0, tot1 = 0, tot2 = 0, tot3 = 0, tot4 = 0, tot5 = 0;

		for (int cont = 0; cont < 5; cont++) {
			System.out.print("Digite a idade: ");
			idade = e.nextInt();

			if (idade <= 15) {
				tot1++;
			} else {
				if (idade <= 30) {
					tot2++;
				} else {
					if (idade <= 45) {
						tot3++;
					} else {
						if (idade <= 60) {
							tot4++;
						} else {
							tot5++;
						}
					}
				}
			}
		}

		System.out.println("1ª faixa etária: " + tot1);
		System.out.println("2ª faixa etária: " + tot2);
		System.out.println("3ª faixa etária: " + tot3);
		System.out.println("4ª faixa etária: " + tot4);
		System.out.println("5ª faixa etária: " + tot5);
		System.out.println("Porcentagem 1ª faixa etária: " + fP.format((double) tot1 / 5));

	}

}
