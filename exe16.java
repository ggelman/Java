package fiap;

import java.util.Scanner;

public class exe16 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int[] vetor = new int[10];
		int impar = 0, par = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Valor --> ");
			vetor[i] = e.nextInt();

			if (vetor[i] % 2 != 0) {
				impar++;
			}
		}

		System.out.println("Impares: " + impar);
		System.out.println("Pares: " + (vetor.length - impar));

	}

}
