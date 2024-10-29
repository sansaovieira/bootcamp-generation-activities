package day6;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBruto {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontosColaborador, salarioLiquido;
		
		System.out.println("Entre com o seu salário bruto: ");
		salarioBruto = read.nextFloat();
		
		System.out.println("Entre com o adicional noturno: ");
		adicionalNoturno = read.nextFloat();
		
		System.out.println("Entre com as horas extras: ");
		horasExtras = read.nextFloat();
		
		System.out.println("Entre com o desconto do colaborador: ");
		descontosColaborador = read.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontosColaborador;
		
		System.out.println("O salário liquido é: " + salarioLiquido);

	}

}
