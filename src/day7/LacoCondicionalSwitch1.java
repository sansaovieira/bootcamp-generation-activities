package day7;

import java.util.Scanner;

public class LacoCondicionalSwitch1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int codigoDoProduto, qtdDoProduto;
		double preco = 0.0, valorTotal;
		
		System.out.println("Selecione o item que você deseja: ");
		System.out.println("\n_______________________________________________");
		System.out.println("\n================ Produto ============    preço");
		System.out.println("Selecione: 1 para: Cachorro Quente      R$ 10.00");
		System.out.println("Selecione: 2 para: X-Salada             R$ 15.00");
		System.out.println("Selecione: 3 para: X-Bacon              R$ 18.00");
		System.out.println("Selecione: 4 para: Bauru                R$ 12.00");
		System.out.println("Selecione: 5 para: Refrigerante         R$ 8.00");
		System.out.println("Selecione: 6 para: Suco de laranja      R$ 13.00");
		System.out.println("\n_______________________________________________");
		codigoDoProduto = scanner.nextInt();
		 
		switch(codigoDoProduto) {
		case 1: System.out.println("Selecionado código: 1 - Cachorro Quente");
			preco = 10.00;
			break;
		case 2: System.out.println("Selecionado código: 2 - X-Salada");
			preco = 15.00;
			break;
		case 3: System.out.println("Selecionado código: 3 - X-Bacon");
			preco = 18.00;
			break;
		case 4: System.out.println("Selecionado código: 4 - Bauru");
			preco = 12.00;
			break;
		case 5: System.out.println("Selecionado código: 5 - Refrigerante");
			preco = 8.00;
			break;
		case 6: System.out.println("Selecionado código: 6 - Suco de laranja");
			preco = 13.00;
			break;
		default:
			System.out.println("Opção inválida!");
		}

		System.out.println("\nSelecione a quantidade que você deseja: ");
		qtdDoProduto = scanner.nextInt();
		
		valorTotal = qtdDoProduto * preco;
		
		System.out.println("Valor total: " + " R$" +valorTotal);
		scanner.close();

	}

}
