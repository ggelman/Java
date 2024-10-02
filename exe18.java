package fiap;

import java.util.Random;
import java.util.Scanner;

public class exe18 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		Random rd = new Random();

		int w = rd.nextInt() % 5;
		int x = rd.nextInt(10);
		int y = rd.nextInt(1, 11);
		int z = rd.nextInt(65, 91);
		char c = (char) z;

		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(c);
		System.out.println("ASCII -> " + z + " -> " + c);

	}

}
