package day8;

import java.util.Scanner;

public class LerNumerosVerificarParidade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero, totalNumerosPares = 0, totalNumerosImpares = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("\nDigite o número" +i+ " :");
			numero = scanner.nextInt();
		
			if(numero % 2 == 0) {
				totalNumerosPares++;
			
			} else {
				totalNumerosImpares++;
			}

		}
		
		System.out.println("\nTotal de números pares: " +totalNumerosPares);
		System.out.println("Total de números impares: " +totalNumerosImpares);
		
		scanner.close();
		
	}

}