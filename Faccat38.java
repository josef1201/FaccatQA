package Faccat;

import java.util.Scanner;

public class Faccat38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigoUsuarioEsperado = 1234;
		int senhaEsperada = 9999;

		System.out.print("Informe o código de usuário: ");
		int codigoUsuario = sc.nextInt();

		if (codigoUsuario != codigoUsuarioEsperado) {
			System.out.println("Usuário inválido!");
		} else {

			System.out.print("Informe a senha: ");
			int senha = sc.nextInt();

			if (senha == senhaEsperada) {
				System.out.println("Acesso permitido!");
			} else {
				System.out.println("Senha incorreta.");
			}
		}

		sc.close();
	}
}
