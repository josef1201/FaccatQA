package Faccat;

import java.util.Scanner;

public class Faccat29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();

		System.out.print("Digite o segundo valor: ");
		int valor2 = sc.nextInt();

		System.out.print("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();

		int somaDosDoisMaiores = calcularSomaDosDoisMaiores(valor1, valor2, valor3);

		System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);

		sc.close();
	}

	public static int calcularSomaDosDoisMaiores(int a, int b, int c) {
		if (a >= b && a >= c) {
			return b + c;
		} else if (b >= a && b >= c) {
			return a + c;
		} else {
			return a + b;
		}
	}
}
