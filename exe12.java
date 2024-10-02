package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe12 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");

		int numCri = 0, tempo = 0;
		char sexo;
		double percF = 0, percM = 0, cont24 = 0;

		System.out.println("Digite o número de crianças: ");
		numCri = e.nextInt();

		for (int i = 0; i < numCri; i++) {
			System.out.println((i + 1 + "º Criança"));

			System.out.println("Tempo de vida em meses: ");
			tempo = e.nextInt();

			System.out.println("Sexo: ");
			sexo = e.next().toUpperCase().charAt(0);

			while (!(sexo == 'F') && !(sexo == 'M')) {
				System.out.println("Sexo M/F: ");
				sexo = e.next().toUpperCase().charAt(0);
			}

			if (sexo == 'F') {
				percF++;
			} else {
				percM++;
			}

			if (tempo < 24) {
				cont24++;
			}
		}

		System.out.println("Porcentagem Feminino: " + fP.format((double) percF / numCri));
		System.out.println("Porcentagem Masculino: " + fP.format((double) percM / numCri));
		System.out.println("Número de crianças com menos de 24 meses: " + cont24);

	}

}
