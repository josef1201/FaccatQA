package Faccat;

import java.util.Scanner;

public class Faccat16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de maçãs compradas: ");
		int quantidadeMacas = sc.nextInt();

		double duzia = 1.30, umaduzia = 1.00;

		double custoTotal;
		if (quantidadeMacas < 12) {
			custoTotal = quantidadeMacas * duzia;
		} else {
			custoTotal = quantidadeMacas * umaduzia;
		}

		System.out.println("O custo total da compra é: R$" + custoTotal);

		sc.close();
	}
}
