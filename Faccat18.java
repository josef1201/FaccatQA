package Faccat;

import java.util.Scanner;

public class Faccat18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o ano atual: ");
		int ano = sc.nextInt();

		System.out.print("Digite o ano de nascimento: ");
		int nascimento = sc.nextInt();

		int idade = ano - nascimento;

		if (idade >= 16) {
			System.out.println("Você pode votar este ano!");
		} else {
			System.out.println("Você ainda não pode votar este ano.");
		}

		sc.close();
	}
}
