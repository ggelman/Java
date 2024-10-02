package fiap;

import java.util.Scanner;

public class exe17 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int[] vetor = new int[5];
		int aux;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println((i + 1) + "° Valor --> ");
			vetor[i] = e.nextInt();
		}

		for (int i = 0; i < vetor.length / 2; i++) {
			aux = vetor[i];
			vetor[i] = vetor[vetor.length - 1 - i];
			vetor[vetor.length - 1 - i] = aux;
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}

	}

}
