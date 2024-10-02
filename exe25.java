package fiap;

import java.text.DecimalFormat;
import java.util.Random;

public class exe25 {

	public static void main(String[] args) {

		Random rd = new Random();
		DecimalFormat fP = new DecimalFormat("#,##0.00");

		double[][] temp = new double[10][12];

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = rd.nextDouble(5, 36);
				System.out.print(fP.format(temp[i][j]) + "\t");
			}

			System.out.println();

		}

	}

}
