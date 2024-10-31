package day8;

import java.util.Scanner;

public class LerNumerosInteiros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = scanner.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O intervalo é inválido");
		}
		
		boolean divisorPor3 = numero1 % 3 == 0;
		boolean divisorPor5 = numero2 % 5 == 0;
		
		
	/* 	for(int i = 0; i > divisorPor3 && i > divisorPor5; i++) {
			System.out.println("No intervalo entre " + numero1 + " e " + numero2 + " : ");
			System.out.println(i + " é múltiplo de 3 e 5");
			} */
	}

}
