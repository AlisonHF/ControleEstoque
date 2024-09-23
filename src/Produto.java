public class Produto {
	int codigo;
	String nome;
	double quantidade;
	double preco;
	
	
	// CONSTRUTOR
	public Produto(int codigo, String nome, double quantidade, double preco ) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	
	// GET SET CODIGO
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	// GET SET NOME
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	// GET SET QUANTIDADE
	public Double getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	
	// GET SET PREÇO
		public Double getPreco() {
			return this.preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		
	// METODO ToString
	public String toString() {
        return "Produto: " + nome + ", Código: " + codigo + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }
	
	
}