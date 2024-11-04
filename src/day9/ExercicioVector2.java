package day9;

import java.util.Scanner;

public class ExercicioVector2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numerosInteiros[] = new int[10];
		int soma = 0;

		for (int i = 0; i < numerosInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º Número: ");
			numerosInteiros[i] = scanner.nextInt();
			soma += numerosInteiros[i];
		}

		System.out.println("\nElementos nos índices ímpares: ");
		for (int i = 1; i < numerosInteiros.length; i += 2) {
			System.out.println(numerosInteiros[i] + " ");
		}

		System.out.println("\nElementos pares: ");
		for (int i = 0; i < numerosInteiros.length; i += 2) {
			if (numerosInteiros[i] % 2 == 0) {
				System.out.println(numerosInteiros[i] + " ");
			}
		}
		
		double media = (double) soma / numerosInteiros.length;
		System.out.println("\n\nSoma: " + soma);
		System.out.println("\n\nSoma: " + media);
		
		scanner.close();
	}

}
