package fiap;

import java.util.Scanner;

public class exe21 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		int qtd;

		System.out.print("Quantidade de funcionarios: ");
		qtd = e.nextInt();

		String[] nome = new String[qtd];
		double[] salario = new double[nome.length];

		for (int i = 0; i < salario.length; i++) {
			e.nextLine();
			System.out.println("Nome: ");
			nome[i] = e.nextLine();

			System.out.println("Salario: ");
			salario[i] = e.nextDouble();
		}

	}

}
