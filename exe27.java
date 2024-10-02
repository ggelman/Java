package fiap;

import java.util.Random;

public class exe27 {

	public static void main(String[] args) {

		Random rd = new Random();
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[a.length + b.length];
		int i, j;

		for (i = j = 0; i < a.length; i++) {
			a[i] = rd.nextInt(a.length * 3);
			c[j++] = a[i];
			b[i] = rd.nextInt(b.length * 2);
			c[j++] = b[i];
		}

		// imprime o vetor A no vídeo
		System.out.println("Vetor A:");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// imprime o vetor B no vídeo
		System.out.println("\nVetor B:");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		// imprime o vetor C no vídeo
		System.out.println("\nVetor C:");
		for (i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

	}

}
