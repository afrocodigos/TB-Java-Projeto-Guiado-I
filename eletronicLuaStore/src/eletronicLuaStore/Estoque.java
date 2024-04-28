package eletronicLuaStore;
import java.util.ArrayList;


public class Estoque {
	private ArrayList <Produto> produtos;
	
	public Estoque() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public Produto buscarProdutoPorNome(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				return produto;
			}
		}
		return null; 
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}
	
	public void listarProdutos() {
		if (produtos.isEmpty()){
			System.out.println("Nenhum produto em estoque");
		} else { 
			System.out.println("Produtos em estoque: ");
			for (Produto produto : produtos) {
				System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade() + ", Preço: " + produto.getPreco());

			}
		}
	}
	
	public void atualizarPorduto(String nome, int quantidade, double preco) {
		for (Produto produto : produtos) {
			if(produto.getNome().equals(nome)) {
				produto.setQuantidade(quantidade);
				produto.setPreco(preco);
				System.out.println("O produto " + produto.getNome() + "foi atualizado com sucesso");
				
				if(produto.getQuantidade() < 0) {
					produto.setQuantidade(0);
					System.out.println("A quantidade do produto foi ajustada para zero devido a uma atualização negativa.");
				}
				return;
			}
		}
		System.out.println("Produto informado não existe em estoque");	
	}
	
	public void removerProduto(String nome) {
		for (int index = 0; index < produtos.size(); index ++) {
			Produto p = produtos.get(index);
			if(p.getNome().equals(nome)) {
				produtos.remove(index);
				System.out.println("Produto removido com sucesso");
				return;

			}
		}
		System.out.println("Produto infomado não existe em estoque");
	}
}
