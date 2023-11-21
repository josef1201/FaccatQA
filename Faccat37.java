package Faccat;

import java.util.Scanner;

public class Faccat37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de morangos (em Kg): ");
		double quantidadeMorangos = sc.nextDouble();

		System.out.print("Informe a quantidade de maçãs (em Kg): ");
		double quantidadeMacas = sc.nextDouble();

		double precoMorangos = (quantidadeMorangos <= 5) ? 2.50 : 2.20;
		double valorMorangos = quantidadeMorangos * precoMorangos;

		double precoMacas = (quantidadeMacas <= 5) ? 1.80 : 1.50;
		double valorMacas = quantidadeMacas * precoMacas;

		double valorTotal = valorMorangos + valorMacas;

		if (quantidadeMorangos + quantidadeMacas > 8 || valorTotal > 25.00) {
			valorTotal *= 0.90;
		}

		System.out.println("Valor a ser pago pelo cliente: R$ " + valorTotal);

		sc.close();
	}
}
