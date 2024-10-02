package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner (System.in);
		DecimalFormat fM = new DecimalFormat("R$ #0.00");
		
		int cont = 0, contItens = 0, cp = 0;
		char resp = 'S';
		double preco = 0, total = 0;
		
		while(resp != 'N') {
			
			cont++;
			System.out.println((cont) + "º Compra");
			
			// zera total e qtd Itens para próxima compra
			total = 0;
			contItens = 0;
			
			System.out.print("Digite o preço: ");
			preco = e.nextDouble();
			
			while(preco != 0) {
				
				total += preco;
				
				System.out.print("Digite o preço: ");
				preco = e.nextDouble();
				contItens++;
			}
			
			System.out.println("Preço total: " + total);
			System.out.println("Quantidade de itens comprados: " + contItens);
			
			System.out.println("Digite a forma de Pagamento:");
			cp = e.nextInt();
			
			while(cp < 1 || cp > 4) {
				System.out.println("Digite a forma de pagamento: ");
				cp = e.nextInt();
			}
			
			if(cp == 1) {
				System.out.println("À vista em dinheiro: " + fM.format(total*0.90));
			} else {
				if(cp == 2) {
					System.out.println("À vista em cartão: " + fM.format(total*0.95));
				} else {
					if(cp == 3) {
						System.out.println("Em duas vezes: "+ fM.format(total/2));
					} else {
						System.out.println("Em três vezes acréscimo 10%: " + fM.format(total*1.10/3));
					}
				}
			}
			
			System.out.println("Deseja cadastrar nova compra? ");
			resp = e.next().toUpperCase().charAt(0);
			
		}

	}

}
