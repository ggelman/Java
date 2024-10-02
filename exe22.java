package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe22 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ #,##0.00");

		int qtd;
		double folha = 0;

		System.out.println("Quantidade de funcionários: ");
		qtd = e.nextInt();

		String[] nome = new String[qtd];
		double[] salario = new double[nome.length];

		for (int i = 0; i < salario.length; i++) {
			e.nextLine();
			System.out.println("Nome: ");
			nome[i] = e.nextLine();
			System.out.println("Salário: ");
			salario[i] = e.nextDouble();
			folha = folha + salario[i];
		}

		System.out.println("Total da folha de pagamento " + fM.format(folha));

	}

}
