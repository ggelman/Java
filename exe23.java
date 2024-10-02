package fiap;

import java.util.Scanner;

public class exe23 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int[][] x = new int[3][3];

		// ler dados
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.println("Valor: ");
				x[i][j] = e.nextInt();
			}
		}

		// impressão em formato tabular
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");
			}
		}

		System.out.println();

	}

}
