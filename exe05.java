package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");

		int canal = 0, num = 0, totalNum = 0, cont4 = 0, cont5 = 0, cont7 = 0, cont12 = 0;

		System.out.println("Digite o número do canal: ");
		canal = e.nextInt();

		while (!(canal == 4) && !(canal == 5) && !(canal == 7) && !(canal == 12)) {
			System.out.println("Digite o número do canal correto: ");
			canal = e.nextInt();
		}

		while (!(canal == 0)) {

			switch (canal) {
			case 4:
				System.out.println("Digite o número da audiência: ");
				num = e.nextInt();
				cont4 += num;
				break;
			case 5:
				System.out.println("Digite o número da audiência: ");
				num = e.nextInt();
				cont5 += num;
				break;
			case 7:
				System.out.println("Digite o número da audiência: ");
				num = e.nextInt();
				cont7 += num;
				break;
			case 12:
				System.out.println("Digite o número da audiência: ");
				num = e.nextInt();
				cont12 += num;
				break;
			}

			totalNum += num;

			System.out.println("Digite o número do canal: ");
			canal = e.nextInt();

		}

		if (!(totalNum == 0)) {
			System.out.println("Audiêncial canal 4: " + fP.format((double) cont4 / totalNum));
			System.out.println("Audiêncial canal 5: " + fP.format((double) cont5 / totalNum));
			System.out.println("Audiêncial canal 7: " + fP.format((double) cont7 / totalNum));
			System.out.println("Audiêncial canal 12: " + fP.format((double) cont12 / totalNum));
		}

	}

}
