package Faccat;

import java.util.Scanner;

public class Faccat17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota da 1ª avaliação: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a nota da 2ª avaliação: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 6.0) {
			System.out.println("Aluno aprovado! Média: " + media);
		} else {
			System.out.println("Aluno reprovado. Média: " + media);
		}

		sc.close();
	}
}
