import java.util.ArrayList;

public class Estoque {
	private ArrayList<Produto> produtos;
	
	
	// Construtor
	public Estoque() {
		produtos = new ArrayList<>();
		
	}
	
	
	// Metodo Adicionar
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	
	// Metodo Excluir
	public void excluirProduto(int codigo) {
		// FUNÇÃO LAMBDA DE COMPARAÇÃO 
		boolean exclusao = produtos.removeIf(produto -> produto.getCodigo() == codigo);
		
		if (exclusao) {
			System.out.println("Produto excluído com sucesso!");
		}
		
		else {
			System.out.println("o código digitado não existe!");
		}
	}
	
	
	// Metodo atualizar
	public void atualizarQuantidade(int codigo, double novaQuantidade) {
		boolean encontrado = false;
		for (Produto produto : produtos) {
			if (produto.getCodigo() == codigo) {
				produto.setQuantidade(novaQuantidade);
				encontrado = true;
			}
		}
		
		if (!encontrado)
		{
			System.out.println("O código digitado não existe!");
		}
	}
	
	
	// Metodo exibir
	public void exibirEstoque() {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
