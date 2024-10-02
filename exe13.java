package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe13 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");
		DecimalFormat fM = new DecimalFormat("R$ #0.00");

		int contador = 0, codigo = 0;
		int codMaior = 0, codMenor = 0;
		double valorEmp = 0, valorFinal = 0, juros = 0.08, valorJuros = 0;
		double valorParc = 0, totalGeral = 0;
		double maiorEmp = 0, menorEmp = 0;
		double contF = 0, contM = 0;
		String resp = "sim", nome;
		String nomeMaior = null, nomeMenor = null;
		char sexo;

		// repetição controla os empréstimos

		// string utiliza equalIgnoreCase "IgnoreCase" = ignora letra maiúscula ou
		// minúscula
		while (resp.equalsIgnoreCase("sim")) {

			contador++;
			System.out.println(contador + "° Empréstimo");

			System.out.print("Digite seu código: ");
			codigo = e.nextInt();

			System.out.print("Digite o seu nome: ");
			nome = e.next();

			System.out.print("Digite o sexo F/M: ");
			sexo = e.next().toUpperCase().charAt(0);

			while ((sexo != 'F') && (sexo != 'M')) {
				System.out.println("Sexo F/M:");
				sexo = e.next().toUpperCase().charAt(0);
			}

			if (sexo == 'F') {
				contF++;
			} else {
				contM++;
			}

			System.out.print("Informe o valor do empréstimo: ");
			valorEmp = e.nextDouble();
			// soma os valores dos empréstimos
			totalGeral += valorEmp;

			if (contador == 1) {
				menorEmp = valorEmp;
				nomeMenor = nome;
				codMenor = codigo;
				maiorEmp = valorEmp;
				nomeMaior = nome;
				codMaior = codigo;
			} else {
				if (valorEmp > maiorEmp) {
					maiorEmp = valorEmp;
					nomeMaior = nome;
					codMaior = codigo;
				}
				if (valorEmp < menorEmp) {
					menorEmp = valorEmp;
					nomeMenor = nome;
					codMenor = codigo;
				}
			}

			System.out.println("Valor Dívida: " + fM.format(valorEmp) + " - Qtd Parcelas: 1" + " - Valor Parcela: "
					+ fM.format(valorEmp));

			// repetição para o parcelamento
			for (int parc = 2; parc <= 12; parc += 2) {
				valorFinal = valorEmp + (valorEmp * juros);
				valorJuros = valorEmp * juros;
				valorParc = valorFinal / parc;

				System.out.println("Valor Dívida: " + fM.format(valorFinal) + " - Qtd Parcelas: " + parc + " - Juros: "
						+ fP.format(juros) + " - Valor Parcela: " + fM.format(valorParc));

				juros += 0.04;
			}

			System.out.println("Deseja inserir novo empréstimo? ");
			resp = e.next();
		}

		System.out.println("Valor total de empréstimos: " + fM.format(totalGeral));
		System.out.println("Qtd de empréstimos: " + contador);
		System.out.println(
				"Maior empréstimo: " + nomeMaior + " - Valor: " + fM.format(maiorEmp) + " - Código: " + codMaior);
		System.out.println(
				"Menor empréstimo: " + nomeMenor + " - Valor: " + fM.format(menorEmp) + " - Código: " + codMenor);
		System.out.println("Porcentagem de empréstimos por mulheres: " + fP.format(contF / contador));
		System.out.println("Porcentagem de empréstimos por homens: " + fP.format(contM / contador));

	}

}
