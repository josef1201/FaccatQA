package Faccat;

import java.util.Scanner;

public class Faccat30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int valor1 = scanner.nextInt();

		System.out.print("Digite o segundo valor: ");
		int valor2 = scanner.nextInt();

		System.out.print("Digite o terceiro valor: ");
		int valor3 = scanner.nextInt();

		exibirEmOrdemCrescente(valor1, valor2, valor3);

		scanner.close();
	}

	public static void exibirEmOrdemCrescente(int a, int b, int c) {
		if (a <= b && a <= c) {
			System.out.print(a + ", ");
			if (b <= c) {
				System.out.print(b + ", " + c);
			} else {
				System.out.print(c + ", " + b);
			}
		} else if (b <= a && b <= c) {
			System.out.print(b + ", ");
			if (a <= c) {
				System.out.print(a + ", " + c);
			} else {
				System.out.print(c + ", " + a);
			}
		} else {
			System.out.print(c + ", ");
			if (a <= b) {
				System.out.print(a + ", " + b);
			} else {
				System.out.print(b + ", " + a);
			}
		}
		System.out.println(); 
	}
}
