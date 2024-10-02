package fiap;

import java.util.Scanner;

public class exe15 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int[] x = new int[10];
		// maior valor inteiro é Integer.MAX_VALUE e o menor valor inteiro é
		// Integer.MIN_VALUE
		int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

		for (int i = 0; i < x.length; i++) {
			System.out.println("Valor --> ");
			x[i] = e.nextInt();

			if (x[i] > maior) {
				maior = x[i];
			}

			if (x[i] < menor) {
				menor = x[i];
			}
		}

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "; ");
		}
		System.out.println();
		System.out.println("Maior valor -> " + maior);
		System.out.println("Menor valor -> " + menor);

	}

}
