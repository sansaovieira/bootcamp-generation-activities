package day8;

import java.util.Scanner;

public class LerIdadeDeVariasPessoas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 1;
		int pessoasIdadeMenorQue21 = 0;
		int pessoasIdadeMaiorQue50 = 0;

		while (count < 12) {
			System.out.print("Digite a idade da pessoa " + count + ": ");
			int idade = scanner.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade < 21) {
				pessoasIdadeMenorQue21++;
			} else if (idade > 50) {
				pessoasIdadeMaiorQue50++;
			}

			count++;
		}

		System.out.println("\nTotal de pessoas menores de 21 anos: " + pessoasIdadeMenorQue21);
		System.out.println("Total de pessoas maiores de 50 anos: " + pessoasIdadeMaiorQue50);

		scanner.close();

	}

}
