package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05_Pecas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double precoUn1 = sc.nextDouble();
		
		int peca2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double precoUn2 = sc.nextDouble();
		
		double valorTotal = (qtd1 * precoUn1) + (qtd2 * precoUn2);
		
		System.out.printf("VALOR A PAGAR: %.2f", valorTotal);
		
		sc.close();
	}
}
