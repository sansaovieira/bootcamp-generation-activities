package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExUmArrayListAdicionandoCores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome da " + (i + 1 + "°") + " cor: ");
			cores.add(scanner.nextLine());
		}

		System.out.println("Listar todas as cores: " + cores);
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores: " + cores);

		scanner.close();
	}

}
