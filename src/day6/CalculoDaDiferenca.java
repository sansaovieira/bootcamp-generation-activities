package day6;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDaDiferenca {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		float n1, n2, n3, n4, calcularDiferenca;
		
		System.out.println("Entre com o primeiro número: ");
		n1 = read.nextFloat();
		
		System.out.println("Entre com o segundo número: ");
		n2 = read.nextFloat();
		
		System.out.println("Entre com o terceiro número: ");
		n3 = read.nextFloat();
		
		System.out.println("Entre com o quarto número: ");
		n4 = read.nextFloat();
		
		calcularDiferenca = (n1 * n2) - (n3 * n4) ;
		
		System.out.println("O cálculo da diferença é: " + calcularDiferenca);
	}

}
