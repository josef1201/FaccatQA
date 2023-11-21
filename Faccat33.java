package Faccat;

import java.util.Scanner;

public class Faccat33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int numero2 = sc.nextInt();

		if (numero1 == numero2) {
			System.out.println("Números iguais");
		} else if (numero1 > numero2) {
			System.out.println("Primeiro é maior");
		} else {
			System.out.println("Segundo é maior");
		}

		sc.close();
	}
}
