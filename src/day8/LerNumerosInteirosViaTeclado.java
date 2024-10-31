package day8;

import java.util.Scanner;

public class LerNumerosInteirosViaTeclado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero, soma = 0, contador = 0;

		do {
			System.out.println("\nDigite um número: ");
			numero = scanner.nextInt();

			if (numero != 0 && numero % 3 == 0) {
				soma += numero;
				contador++;
			}

		} while (numero != 0);

		if (contador > 0) {
			double media = (double) soma / contador;
			System.out.printf("A média de todos os números múltiplos de 3 é: %.2f\n", media);
		} 
		
		
		scanner.close();
	}

}
