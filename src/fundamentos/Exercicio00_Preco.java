package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio00_Preco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metrosQuadrados = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metrosQuadrados;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}

}


/*

		double largura, comprimento, valorm, area, preco;

		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		valorm = sc.nextDouble();

		System.out.printf("Largura: %.1f, comprimento: %.1f e valor: R$%.2f%n", largura, comprimento, valorm);

		area = largura * comprimento;

		System.out.printf("AREA: %.2f%n", area);

		preco = area * valorm;

		System.out.printf("PRECO: R$%.2f%n ", preco);

		sc.close();
	}

}*/
