package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ExUmCollectionSetSolicitarDadosAoUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		HashSet<Integer> numerosInteiros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("\nDigite o " + (i + 1 + "°") + "número");
			int numeroDigitado = scanner.nextInt();
			if (!numerosInteiros.add(numeroDigitado)) {
				System.out.println("\nEste número já foi inserido! \nPor favor, digite um número não repetido");
			}
		}

		System.out.println("Listar dados do set: ");
		Iterator<Integer> iterator = numerosInteiros.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		scanner.close();
	}

}
