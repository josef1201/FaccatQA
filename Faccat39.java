package Faccat;

public class Faccat39 {

	public static void main(String[] args) {
		
		boolean A = true;
		boolean B = true;
		boolean C = false;

		
		boolean resultadoA = (A && B) || (A ^ B);
		System.out.println("(A e B) ou (A xou B): " + resultadoA);

		
		boolean resultadoB = (A || B) && (A && C);
		System.out.println("(A ou B) e (A e C): " + resultadoB);

		
		boolean resultadoC = A || (C && B) ^ (A && !B);
		System.out.println("A ou C e B xou A e não B: " + resultadoC);
	}
}
