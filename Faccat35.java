package Faccat;

import java.util.Scanner;

public class Faccat35 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double gasolina = 5.80;
		double alcool = 3.64;

		int litros;
		char tipoCombustivel;
		double precoLitro, valorPago;

		System.out.print("Digite o número de litros vendidos: ");
		litros = sc.nextInt();

		System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
		tipoCombustivel = sc.next().charAt(0);

		if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
			precoLitro = alcool;
			if (litros <= 20) {
				precoLitro *= 0.97;
			} else {
				precoLitro *= 0.95;
			}
		} else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
			precoLitro = gasolina;
			if (litros <= 20) {
				precoLitro *= 0.96;
			} else {
				precoLitro *= 0.94;
			}
		} else {
			System.out.println("Tipo de combustível inválido. Use A para álcool ou G para gasolina.");
			sc.close();
			return;
		}

		valorPago = litros * precoLitro;

		System.out.printf("Valor a ser pago: R$ %.2f%n", valorPago);

		sc.close();
	}
}
