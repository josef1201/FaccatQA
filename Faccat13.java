package Faccat;

import java.util.Scanner;

public class Faccat13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();

		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();

		double mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

		System.out.println("\nA média final do aluno é: " + mediaFinal);

		sc.close();
	}
}
