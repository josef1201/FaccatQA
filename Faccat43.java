package Faccat;

import java.util.Scanner;

public class Faccat43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor1, valor2, resultado;

		System.out.print("Informe o primeiro valor: ");
		valor1 = lerNumeroDoUsuario();

		System.out.print("Informe o segundo valor: ");
		valor2 = lerNumeroDoUsuario();

		while (valor2 == 0) {
			System.out.println("O segundo valor não pode ser zero. Informe um novo valor:");
			valor2 = lerNumeroDoUsuario();
		}

		resultado = valor1 / valor2;

		System.out.println("O resultado da divisão é: " + resultado);
	}

	private static double lerNumeroDoUsuario() {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
}
