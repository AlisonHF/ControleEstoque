import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Estoque estoque = new Estoque();
		
		while(true) {
			System.out.println("Escolha uma opção: \n"
					+ "0- Sair do sistema\n"
					+ "1- Adicionar produto\n"
					+ "2- Exibir estoque\n"
					+ "3- Atualizar quantidade\n"
					+ "4- Apagar produto");
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			// Fechar o sistema
			if (opcao == 0) {
				System.out.println("Fechando o sistema...");
				scanner.close();
				break;
			}
			
			// Adicionar produto
			else if(opcao == 1) {
				int codigo = 0;
				String nome = "";
				double quantidade = 0;
				double preco = 0;
				
				// Codigo
				try {
					System.out.println("Digite o código do produto: ");
					codigo = scanner.nextInt();
					scanner.nextLine();
				}
				
				catch(InputMismatchException e) {
					System.out.println("Tipo de dado digitado é incorreto!\n"
							+ "Esse campo só recebe números inteiros!\n");
					scanner.nextLine();
					continue;
				}
				
				// Nome
				try {	
					System.out.println("Digite o nome do produto: ");
					nome = scanner.nextLine();
				}
				
				catch(InputMismatchException e) {
					System.out.println("Tipo de dado digitado é incorreto!\n"
							+ "Esse campo só recebe textos!\n");
					scanner.nextLine();
					continue;
				}
					
				// Quantidade
				try {
					System.out.println("Digite a quantidade do produto: ");
					quantidade = scanner.nextDouble();
				}
				
				catch(InputMismatchException e) {
					System.out.println("Tipo de dado digitado é incorreto!\n"
							+ "Esse campo só recebe números decimais!\n");
					scanner.nextLine();
					continue;
				}
					
				// Preço
				try {
					System.out.println("Digite o preço do produto: ");
					preco = scanner.nextDouble();
				}
					
				catch(InputMismatchException e) {
					System.out.println("Tipo de dado digitado é incorreto!\n"
							+ "Esse campo só recebe números decimais!\n");
					scanner.nextLine();
					continue;
				}
					
				Produto produtoAdicionar = new Produto(codigo, nome, quantidade, preco);
				estoque.adicionarProduto(produtoAdicionar);
			}
				
			
			// Exibir estoque
			else if(opcao == 2) {
				System.out.println("Mostrando os produtos no estoque:");
				estoque.exibirEstoque();
			}
			
			
			// Atualizar quantidade em estoque
			else if(opcao == 3) {
				int codigo = 0;
				double quantidade = 0;
				
				System.out.println("Atualização de quantidade\n");
				System.out.println("Digite o código do produto: ");
				codigo = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Digite a nova quantidade: ");
				quantidade = scanner.nextDouble();
				estoque.atualizarQuantidade(codigo, quantidade);
			}
			
			
			// Excluir produtos
			else if(opcao == 4) {
				System.out.println("Exclusão de produto");
				System.out.println("Digite o código do produto:");
				int codigo = scanner.nextInt();
				
				estoque.excluirProduto(codigo);
			}
		}
	}
}
