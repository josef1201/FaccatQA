package Faccat;

import java.util.Scanner;

public class Faccat19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		double valor1 = sc.nextDouble();

		System.out.print("Digite o segundo valor: ");
		double valor2 = sc.nextDouble();

		if (valor1 > valor2) {
			System.out.println("O maior valor é: " + valor1);
		} else {
			System.out.println("O maior valor é: " + valor2);
		}

		sc.close();
	}
}
