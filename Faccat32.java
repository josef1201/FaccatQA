package Faccat;

import java.util.Scanner;

public class Faccat32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do primeiro time: ");
		String time1 = sc.nextLine();

		System.out.print("Digite o número de gols marcados pelo " + time1 + ": ");
		int golsTime1 = sc.nextInt();

		sc.nextLine();

		System.out.print("Digite o nome do segundo time: ");
		String time2 = sc.nextLine();

		System.out.print("Digite o número de gols marcados pelo " + time2 + ": ");
		int golsTime2 = sc.nextInt();

		if (golsTime1 > golsTime2) {
			System.out.println("O vencedor é: " + time1);
		} else if (golsTime2 > golsTime1) {
			System.out.println("O vencedor é: " + time2);
		} else {
			System.out.println("EMPATE");
		}

		sc.close();
	}
}
