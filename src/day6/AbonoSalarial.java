package day6;

import java.util.Locale;
import java.util.Scanner;

public class AbonoSalarial {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
	
		float salario, abono, novoSalario;
		
		System.out.println("Digite o seu salário: ");
		salario = read.nextFloat();
		
		System.out.println("\nDigite o abono: ");
		abono = read.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\n O seu salário anterior foi " + salario + "\n com o abono, o seu novo salario é: " + novoSalario);

	}

}
