package day11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> ordemDeChegadaDosClientes = new LinkedList<String>();

		for (int i = 0; i < Integer.MAX_VALUE; i++) {

			System.out.println("\n\n*************** Escolha o tipo de operação *******************");
			System.out.println("\n               1 - Adicionar um novo Cliente na Fila");
			System.out.println("               2 - Listar todos os Clientes");
			System.out.println("               3 - Chamar (retirar) uma pessoa da fila");
			System.out.println("               0 - Sair");
			System.out.println("\n\n***************************************************************");

			int escolhaMenu = scanner.nextInt();
			scanner.nextLine();

			switch (escolhaMenu) {
			case 1:
				System.out.println("\nAdicionar um novo Cliente na Fila...");
				System.out.println("\nDigite o nome do cliente: ");
				String cliente = scanner.nextLine();
				ordemDeChegadaDosClientes.add(cliente);
				System.out.println("\nO cliente " + cliente + " foi adicionado a lista!");
				break;

			case 2:
				System.out.println("\nListar todos os Clientes");
				if (ordemDeChegadaDosClientes.isEmpty()) {
					System.out.println("A lista está vázia!");
				} else {
					for (String clientes : ordemDeChegadaDosClientes) {
						System.out.println("- " + clientes);
					}
				}
				break;

			case 3:
				System.out.println("\nChamar (retirar) uma pessoa da fila");
				if (!ordemDeChegadaDosClientes.isEmpty()) {
					System.out.println("Retirar o elemento da lista: " + ordemDeChegadaDosClientes.poll());
				} else {
					System.out.println("A lista está vázia!");
				}

				break;

			case 0:
				System.out.println("\nSair");
				i = Integer.MAX_VALUE;
				System.out.println("\nPrograma finalizado!");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		}

		scanner.close();

	}

}
