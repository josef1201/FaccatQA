package Faccat;

import java.util.Scanner;

public class Faccat42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Informe o número do empregado (código): ");
		int codigo = sc.nextInt();

		System.out.print("Informe o ano de nascimento: ");
		int anoNascimento = sc.nextInt();

		System.out.print("Informe o ano de ingresso na empresa: ");
		int anoIngresso = sc.nextInt();

		
		int idade = 2023 - anoNascimento;
		int tempoTrabalho = 2023 - anoIngresso;

		
		boolean qualificado = false;

		if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
			qualificado = true;
		}

		
		System.out.println("\nResultados:");
		System.out.println("Número do empregado: " + codigo);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

		if (qualificado) {
			System.out.println("Requerer aposentadoria");
		} else {
			System.out.println("Não requerer");
		}

		sc.close();
	}
}
