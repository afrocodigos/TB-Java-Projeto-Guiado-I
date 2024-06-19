package juliaoStore;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto em estoque");
        } else {
            System.out.println("Produtos em estoque:");
            System.out.printf("%-20s %15s %15s\n", "Nome", "Quantidade", "Preço");
            System.out.println("--------------------------------------------------------");
            for (Produto produto : produtos) {
                System.out.printf("%-20s %15d %15.2f\n", produto.getNome(), produto.getQuantidade(), produto.getPreco());
            }
        }
    }

    public void atualizarProduto(String nome, int quantidade, double preco) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);
                System.out.println("O produto " + produto.getNome() + " foi atualizado com sucesso");
                return;
            }
        }
        System.out.println("Produto informado não existe em estoque");
    }

    public void removerProduto(String nome) {
        for (int index = 0; index < produtos.size(); index++) {
            Produto p = produtos.get(index);
            if (p.getNome().equals(nome)) {
                produtos.remove(index);
                System.out.println("Produto removido com sucesso");
                return;
            }
        }
        System.out.println("Produto informado não existe em estoque");
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Produto buscarProdutoPorId(int id) {
        if (id >= 0 && id < produtos.size()) {
            return produtos.get(id);
        }
        return null;
    }
}
