package Faccat;

import java.util.Scanner;

public class Faccat31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do lado A: ");
		double a = sc.nextDouble();

		System.out.print("Digite o valor do lado B: ");
		double b = sc.nextDouble();

		System.out.print("Digite o valor do lado C: ");
		double c = sc.nextDouble();

		if (formaTriangulo(a, b, c)) {
			System.out.println("Os valores formam um triângulo.");
		} else {
			System.out.println("Os valores NÃO formam um triângulo.");
		}

		sc.close();
	}

	public static boolean formaTriangulo(double a, double b, double c) {
		return a < b + c && b < a + c && c < a + b;
	}
}
