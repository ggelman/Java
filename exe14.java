package fiap;

import java.util.Scanner;

public class exe14 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int[] x = new int[5];

		// preenchendo o vetor
		// x.length pega o valor de x na variável que foi definida
		for (int i = 0; i < x.length; i++) {
			System.out.println("Valor --> ");
			x[i] = e.nextInt();
		}

		// impressão dos elementos do vetor
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);

		}

	}

}
