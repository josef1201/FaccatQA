package Faccat;

import java.util.Scanner;

public class Faccat11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de carros vendidos: ");
		int carros = sc.nextInt();

		System.out.print("Digite o valor total das vendas: R$");
		double vendas = sc.nextDouble();

		System.out.print("Digite o salário fixo do vendedor: R$");
		double salarioFixo = sc.nextDouble();

		System.out.print("Digite o valor por carro vendido: R$");
		double valorCarro = sc.nextDouble();

		double comissao = 0.05 * vendas;

		double salarioFinal = salarioFixo + (carros * valorCarro) + comissao;

		System.out.println("\nSalário final do vendedor: R$" + salarioFinal);

		sc.close();
	}
}
