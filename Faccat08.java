package Faccat;

import java.util.Scanner;

public class Faccat08 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Digite o número total de eleitores: ");
	        double tEleitores = sc.nextInt();

	        
	        System.out.print("Digite o número de votos brancos: ");
	        double vBrancos = sc.nextInt();

	      
	        System.out.print("Digite o número de votos nulos: ");
	        double vNulos = sc.nextInt();

	        
	        System.out.print("Digite o número de votos válidos: ");
	        float votosValidos = sc.nextInt();

	        
	        double pBrancos =  vBrancos / tEleitores * 100;

	        
	       double pNulos =  vNulos / tEleitores * 100;

	        
	       double percentualValidos =  votosValidos / tEleitores * 100;

	       
	        System.out.println("\nResultados:");
	        System.out.println("Percentual de votos brancos: " + pBrancos + "%");
	        System.out.println("Percentual de votos nulos: " + pNulos + "%");
	        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

	      
	        sc.close();
	    }
	}


