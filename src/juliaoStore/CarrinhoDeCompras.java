package juliaoStore;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto, Integer> itens;

    public CarrinhoDeCompras() {
        this.itens = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (itens.containsKey(produto)) {
            itens.put(produto, itens.get(produto) + quantidade);
        } else {
            itens.put(produto, quantidade);
        }
        System.out.println("Produto adicionado ao carrinho com sucesso!");
    }

    public void removerProduto(Produto produto, int quantidade) {
        if (itens.containsKey(produto)) {
            int quantidadeAtual = itens.get(produto);
            if (quantidadeAtual <= quantidade) {
                itens.remove(produto);
                System.out.println("Produto removido do carrinho com sucesso!");
            } else {
                itens.put(produto, quantidadeAtual - quantidade);
                System.out.println("Quantidade atualizada no carrinho!");
            }
        } else {
            System.out.println("Produto não encontrado no carrinho!");
        }
    }

    public void listarProdutos() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum produto no carrinho");
        } else {
            System.out.println("Produtos no carrinho:");
            System.out.printf("%-20s %-10s %-10s\n", "Nome", "Quantidade", "Preço");
            System.out.println("--------------------------------------------------------");
            for (Map.Entry<Produto, Integer> entry : itens.entrySet()) {
                Produto produto = entry.getKey();
                int quantidade = entry.getValue();
                System.out.printf("%-20s %-10d %-10.2f\n", produto.getNome(), quantidade, produto.getPreco());
            }
        }
    }

    public double calcularTotalCompra() {
        double total = 0.0;
        for (Map.Entry<Produto, Integer> entry : itens.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            total += produto.getPreco() * quantidade;
        }
        return total;
    }

    public void limparCarrinho() {
        itens.clear();
        System.out.println("Carrinho limpo!");
    }
}
