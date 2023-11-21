package Faccat;

import java.util.Scanner;

public class Faccat41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a nota N1: ");
		double n1 = sc.nextDouble();

		System.out.print("Informe a nota N2: ");
		double n2 = sc.nextDouble();

		System.out.print("Informe a nota N3: ");
		double n3 = sc.nextDouble();

		System.out.print("Informe a média dos exercícios: ");
		double mediaExercicios = sc.nextDouble();

		double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;

		String conceito;
		if (mediaAproveitamento >= 9.0) {
			conceito = "A";
		} else if (mediaAproveitamento >= 7.5) {
			conceito = "B";
		} else if (mediaAproveitamento >= 6.0) {
			conceito = "C";
		} else {
			conceito = "D";
		}

		System.out.println("\nResultados:");
		System.out.println("Média de Aproveitamento: " + mediaAproveitamento);
		System.out.println("Conceito: " + conceito);

		sc.close();
	}
}
