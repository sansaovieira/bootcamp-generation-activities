package day7;

import java.util.Scanner;

public class LacoCondicionalSwitch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float salario, novoSalario;
		int reajuste = 0, codigoDoColaborador;
		String nome;
		
		System.out.println("Selecione o código do seu cargo: ");
		System.out.println("\n_______________________________________________");
		System.out.println("\n====== Código ===== Cargo ========    Percentual do Reajuste");
		System.out.println("Selecione: 1   para: Gerente                        10%");
		System.out.println("Selecione: 2   para: Vendedor                        7%");
		System.out.println("Selecione: 3   para: Supervisor                      9%");
		System.out.println("Selecione: 4   para: Motorista                       6%");
		System.out.println("Selecione: 5   para: Estoquista                      5%");
		System.out.println("Selecione: 6   para: Técnico de TI                   8%");
		System.out.println("\n_______________________________________________");
		codigoDoColaborador = scanner.nextInt();
		 
		switch(codigoDoColaborador) {
		case 1: System.out.println("Selecionado código: 1 - Gerente");
			reajuste = 10;
			break;
		case 2: System.out.println("Selecionado código: 2 - Vendedor");
			reajuste = 7;
			break;
		case 3: System.out.println("Selecionado código: 3 - Supervisor");
			reajuste = 9;
			break;
		case 4: System.out.println("Selecionado código: 4 - Motorista");
			reajuste = 6;
			break;
		case 5: System.out.println("Selecionado código: 5 - Estoquista");
			reajuste = 5;
			break;
		case 6: System.out.println("Selecionado código: 6 - Técnico de TI");
			reajuste = 8;
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		System.out.println(" Digite o seu nome: ");
		nome = scanner.next();
		
		System.out.println(" Qual é o seu salário? ");
		salario = scanner.nextFloat();
		
		novoSalario = salario + (salario * reajuste / 100);

		 System.out.println("\nNome do colaborador: " + nome);
	     System.out.println("Cargo: " + codigoDoColaborador);
	     System.out.printf("Salário reajustado: R$ %.2f\n", novoSalario);
		
	     scanner.close();

	}


}
