package Faccat;

import java.util.Scanner;

public class Faccat09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário mensal atual do funcionário: R$");
		double salario = sc.nextDouble();

		System.out.print("Digite o percentual de reajuste: ");
		double percentualReajuste = sc.nextDouble();

		double nSalario = salario * (1 + percentualReajuste / 100);

		System.out.println("\nNovo salário após o reajuste: R$" + nSalario);

		sc.close();
	}
}