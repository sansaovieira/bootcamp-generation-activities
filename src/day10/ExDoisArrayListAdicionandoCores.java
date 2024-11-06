package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class ExDoisArrayListAdicionandoCores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();

		numerosInteiros.add(2);
		numerosInteiros.add(5);
		numerosInteiros.add(1);
		numerosInteiros.add(3);
		numerosInteiros.add(4);
		numerosInteiros.add(9);
		numerosInteiros.add(7);
		numerosInteiros.add(8);
		numerosInteiros.add(10);
		numerosInteiros.add(6);

		int numeroDigitado;

		while (true) {
			System.out.println("\nDigite o número que você deseja encontrar: ");
			numeroDigitado = scanner.nextInt();
			if (numeroDigitado >= 0) {
				break; 
			} else {
				System.out.println("\nO número " + numeroDigitado + " é negativo, por favor digite um número positivo.");
			}
		}

		if (numerosInteiros.contains(numeroDigitado)) {
			System.out.println("\nNúmero " + numeroDigitado + " Encontrado!");
		} else {
			System.out.println("\nO número " + numeroDigitado + " não foi encontrado!");
		}

		scanner.close();
	}

}
