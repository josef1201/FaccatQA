package Faccat;

import java.util.Scanner;

public class Faccat20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		double valor1 = sc.nextDouble();

		System.out.print("Digite o segundo valor: ");
		double valor2 = sc.nextDouble();

		if (valor1 < valor2) {
			System.out.println("Os valores em ordem crescente são: " + valor1 + " e " + valor2);
		} else {
			System.out.println("Os valores em ordem crescente são: " + valor2 + " e " + valor1);
		}

		sc.close();
	}
}
