package Faccat;

import java.util.Scanner;

public class Faccat10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o custo de fábrica do carro: R$");
		double fabrica = sc.nextDouble();

		double distribuidor = 0.28; // 28%
		double Impostos = 0.45; // 45%

		
		double consumidor = fabrica + (distribuidor)
				+ (fabrica * Impostos);

	
		System.out.println("\nCusto final ao consumidor: R$" + consumidor);

		sc.close();
	}
}
