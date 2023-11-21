package Faccat;

import java.util.Scanner;

public class Faccat22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de horas trabalhadas em um mês: ");
		int horasTrabalhadas = sc.nextInt();

		System.out.print("Digite o salário por hora: ");
		double salarioPorHora = sc.nextDouble();

		int horasSemanais = 40;

		double salarioTotal;
		if (horasTrabalhadas <= horasSemanais * 4) {

			salarioTotal = horasTrabalhadas * salarioPorHora;
		} else {

			int horasExtras = horasTrabalhadas - horasSemanais * 4;
			double salarioRegular = horasSemanais * 4 * salarioPorHora;
			double salarioExtras = horasExtras * 1.5 * salarioPorHora;
			salarioTotal = salarioRegular + salarioExtras;
		}

		System.out.println("O salário total do funcionário é: R$" + salarioTotal);

		sc.close();
	}
}
