package day9;

import java.util.Scanner;

public class ExercicioVector1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numerosInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int i;
		
		System.out.print("Digite um número: ");
        int numerosDigitado = scanner.nextInt();

		for (i = 0; i < numerosInteiros.length; i++) {
			if (numerosDigitado == numerosInteiros[i]) {
				System.out.println("O número " + numerosDigitado + " está localizado na posição: " + i);
				break;
			}
		}
		if (i == numerosInteiros.length) {
			System.out.println("O número " + numerosDigitado + " não foi encontrado!");
		}
		
		scanner.close();
	}

}
