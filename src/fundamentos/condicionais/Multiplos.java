package fundamentos.condicionais;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois números: ");

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} 
		else {
			System.out.println("Nao sao multiplos");
		}
		sc.close();
	}
}
