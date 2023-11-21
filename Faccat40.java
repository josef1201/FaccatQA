package Faccat;

import java.util.Scanner;

public class Faccat40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a descrição do produto: ");
		String descricao = sc.nextLine();

		System.out.print("Informe a quantidade adquirida: ");
		int quantidade = sc.nextInt();

		System.out.print("Informe o preço unitário: ");
		double precoUnitario = sc.nextDouble();

		double total = quantidade * precoUnitario;
		double desconto = 0;

		if (quantidade <= 5) {
			desconto = total * 0.02;
		} else if (quantidade <= 10) {
			desconto = total * 0.03;
		} else {
			desconto = total * 0.05;
		}

		double totalPagar = total - desconto;

		System.out.println("\nResumo da Compra:");
		System.out.println("Descrição do Produto: " + descricao);
		System.out.println("Quantidade Adquirida: " + quantidade);
		System.out.println("Preço Unitário: R$ " + precoUnitario);
		System.out.println("Total: R$ " + total);
		System.out.println("Desconto: R$ " + desconto);
		System.out.println("Total a Pagar: R$ " + totalPagar);

		sc.close();
	}
}
