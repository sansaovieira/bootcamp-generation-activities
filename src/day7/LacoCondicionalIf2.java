package day7;

import java.util.Scanner;

public class LacoCondicionalIf2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int selecionaNumero;
		
		System.out.println("Digite um número: ");
		selecionaNumero = scanner.nextInt();
		
		if(selecionaNumero % 2 == 0 && selecionaNumero > 0) {
			System.out.println("O número selecionado é par e positivo!");
		}  else if(selecionaNumero % 2 == 0 && selecionaNumero < 0) {
			System.out.println("O número selecionado é par e negativo!");
		}	else if(selecionaNumero % 2 == 1 && selecionaNumero > 0) {
			System.out.println("O número selecionado é ímpar e positivo!");
		} else {
			System.out.println("O número selecionado é impar e negativo!");
		}
		
		
		scanner.close();
	}

}
