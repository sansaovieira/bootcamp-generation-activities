package day11;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> retiradaDeLivrosDeUmaPilha = new Stack<String>();

		for (int i = 0; i < Integer.MAX_VALUE; i++) {

			System.out.println("\n\n*************** Escolha o tipo de operação *******************");
			System.out.println("\n               1 -  Adicionar um novo livro na pilha");
			System.out.println("               2 -  Listar todos os livros da Pilha");
			System.out.println("               3 -  Retirar um livro da pilha");
			System.out.println("               0 - Sair");
			System.out.println("\n\n***************************************************************");

			int escolhaMenu = scanner.nextInt();
			scanner.nextLine();

			switch (escolhaMenu) {
			case 1:
				System.out.println("\nAdicionar um novo livro na pilha...");
				System.out.println("\nDigite o nome de um livro: ");
				String livro = scanner.nextLine();
				retiradaDeLivrosDeUmaPilha.push(livro);
				System.out.println("\nO livro " + livro + " foi adicionado a lista!");
				break;

			case 2:
				System.out.println("\nListar todos os Clientes");
				if (retiradaDeLivrosDeUmaPilha.isEmpty()) {
					System.out.println("A lista está vázia!");
				} else {
					for (String livros : retiradaDeLivrosDeUmaPilha) {
						System.out.println("- " + livros);
					}
				}
				break;

			case 3:
				System.out.println("\nChamar (retirar) uma pessoa da fila");
				if (!retiradaDeLivrosDeUmaPilha.isEmpty()) {
					System.out.println("Retirar o elemento da lista: " + retiradaDeLivrosDeUmaPilha.pop());
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
