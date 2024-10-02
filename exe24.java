package fiap;

import java.util.Random;
import java.util.Scanner;

public class exe24 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		Random rd = new Random();

		int[][] x = new int[4][4];
		int maior = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = rd.nextInt(50);
				System.out.print(x[i][j] + "\t");
				if (x[i][j] > maior) {
					maior = x[i][j];
				}
			}
			System.out.println();
		}

		System.out.println("Maior valor: " + maior);

		// impressao da localizacao
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] == maior) {
					System.out.println("(" + (i + 1) + ", " + (j + 1) + ")");
				}
			}
		}

	}

}
