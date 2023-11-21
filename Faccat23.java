package Faccat;

import java.util.Scanner;

public class Faccat23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome da pessoa: ");
		String nome = sc.nextLine();

		System.out.print("Digite o sexo da pessoa (M/F): ");
		String sexo = sc.next();

		System.out.print("Digite a altura da pessoa em metros: ");
		double altura = sc.nextDouble();

		double pesoIdeal;

		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = (62.1 * altura) - 44.7;
		} else {
			System.out.println("Sexo inválido. Informe M ou F.");
			sc.close();
			return;
		}

		System.out.println("O peso ideal de " + nome + " é: " + pesoIdeal + " kg");
		sc.close();
	}
}
