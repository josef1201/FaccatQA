package Faccat;

import java.util.Scanner;

public class Faccat14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();

		if (valor > 10) {
			System.out.println("É MAIOR QUE 10!");
		} else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}

		sc.close();
	}
}
