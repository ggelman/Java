package fiap;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int num = 0, maior = 0, menor = 0, cont = 0;

		for (cont = 0; cont < 3; cont++) {
			System.out.println("Digite um número: ");
			num = e.nextInt();

			if (num > maior) {
				maior = num;
			}

			if (cont == 0) {
				menor = num;
			} else {
				if (num < menor) {
					menor = num;
				}
			}

		}

		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);

	}

}
