package Faccat;

import java.util.Scanner;

public class Faccat28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int valor1 = scanner.nextInt();

		System.out.print("Digite o segundo valor: ");
		int valor2 = scanner.nextInt();

		System.out.print("Digite o terceiro valor: ");
		int valor3 = scanner.nextInt();

		int maiorValor = valor1;

		if (valor2 > maiorValor) {
			maiorValor = valor2;
		}

		if (valor3 > maiorValor) {
			maiorValor = valor3;
		}

		System.out.println("O maior valor é: " + maiorValor);

		scanner.close();
	}
}
