package day6;

import java.util.Locale;
import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = read.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = read.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = read.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = read.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua nota final é: " + mediaFinal);
	}

}
