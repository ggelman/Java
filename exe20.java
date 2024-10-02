package fiap;

import java.util.Random;

public class exe20 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] x = new int[rd.nextInt(5, 15)];
		int aux = 0;

		// armazenamento dos dados
		System.out.println("Antes: ");
		for (int i = 0; i < x.length; i++) {
			x[i] = rd.nextInt() % 10;
			System.out.print(x[i] + " ");
		}

		// ordenação dos dados - crescente
		for (int j = 0; j < x.length; j++) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i + 1]) {
					aux = x[i];
					x[i] = x[i + 1];
					x[i + 1] = aux;
				}
			}
		}

		// impressão dos dados
		System.out.println("");
		System.out.println("Depois:");
		for (int i : x) {
			System.out.print(i + " ");
		}

	}

}
