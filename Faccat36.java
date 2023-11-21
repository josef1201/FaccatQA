package Faccat;

import java.util.Scanner;

public class Faccat36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a idade do primeiro homem: ");
		int idadeHomem1 = sc.nextInt();

		System.out.print("Informe a idade do segundo homem: ");
		int idadeHomem2 = sc.nextInt();

		while (idadeHomem1 == idadeHomem2) {
			System.out.println("As idades dos homens devem ser diferentes. Informe novamente.");
			System.out.print("Informe a idade do segundo homem: ");
			idadeHomem2 = sc.nextInt();
		}

		System.out.print("Informe a idade da primeira mulher: ");
		int idadeMulher1 = sc.nextInt();

		System.out.print("Informe a idade da segunda mulher: ");
		int idadeMulher2 = sc.nextInt();

		while (idadeMulher1 == idadeMulher2) {
			System.out.println("As idades das mulheres devem ser diferentes. Informe novamente.");
			System.out.print("Informe a idade da segunda mulher: ");
			idadeMulher2 = sc.nextInt();
		}

		int somaIdades = (idadeHomem1 > idadeHomem2) ? idadeHomem1 + idadeMulher2 : idadeHomem2 + idadeMulher1;

		int produtoIdades = (idadeHomem1 < idadeHomem2) ? idadeHomem1 * idadeMulher2 : idadeHomem2 * idadeMulher1;

		System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + somaIdades);
		System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produtoIdades);

		sc.close();
	}
}
