package Faccat;

import java.util.Scanner;

public class Faccat12 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Digite a temperatura em graus Fahrenheit: ");
	        double fahrenheit = sc.nextDouble();

	        
	        double celsius = (fahrenheit - 32) * 5 / 9;

	        
	        System.out.println("\nA temperatura em graus Celsius é: " + celsius + " °C");

	        sc.close();
	    }
	}


