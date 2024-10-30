package day7;

import java.util.Scanner;

public class LacoCondicionalIf1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valorA, valorB, valorC, soma;
		
		System.out.println("Digite o valor de A: ");
		valorA = scanner.nextInt();
		
		System.out.println("Digite o valor de B: ");
		valorB = scanner.nextInt();
		
		System.out.println("Digite o valor de C: ");
		valorC = scanner.nextInt();
		
		soma = valorA + valorB;
		
		if(soma > valorC) {
			System.out.println("A soma de A" + " + " + "B " + " é maior  do que C");
		} else if (soma < valorC) {
			System.out.println("A soma de A" + " + " + "B " + " é menor  do que C");
		} else {
			System.out.println("A soma de A" + " + " + "B " + " é igual a C");
		}
		
		scanner.close();

	}

}
