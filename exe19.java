package fiap;

import java.util.Random;

public class exe19 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] vetor = new int[10];
		boolean status;

		for (int i = 0; i < vetor.length;) {
			vetor[i] = rd.nextInt(10);
			status = true;
			for (int j = 0; j < i; j++) {
				if (vetor[i] == vetor[j]) {
					status = false;
					break;
				}
			}

			if (status) {
				System.out.print(vetor[i] + "  ");
				i++;
			}

		}

	}

}
