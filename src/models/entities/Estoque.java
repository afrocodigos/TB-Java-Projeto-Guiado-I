package models.entities;

import java.util.ArrayList;

import exceptions.Excecoes;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado com sucesso!");
    }


    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto em estoque");
        } else {
            System.out.println("Produtos em estoque: ");
            for (Produto produto : produtos) {
                String mensagem = String.format("Item: %s, Quantidade: %d, Preço UN: R$ %.2f, Valor total do estoque: R$ %.2f",
                        produto.getNome(), produto.getQuantidade(), produto.getPreco(),
                        produto.getQuantidade() * produto.getPreco());
                System.out.println(mensagem);
            }
        }
    }

    public boolean verificaNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return true;
            }
        }
        throw new Excecoes("Produto não encontrado no estoque.");
    }


    public void atualizarProduto(String nome, int quantidade, double preco) {
        for (Produto produto : produtos) {
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            if (produto.getQuantidade() <= 0) {
                System.out.println("Devido o estoque ter sido zerado, item foi removido.");
                removerProduto((nome));
                return;
            }
            produto.setPreco(preco);
            System.out.println("O produto ->" + produto.getNome() + " foi atualizado com sucesso");
            return;
        }
    }

    public void retirarProduto(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getQuantidade() >= quantidade) {
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                System.out.println(quantidade + " unidades de " + nome + " foram retiradas do estoque.");
                return;
            } else {
                System.out.println("Não há quantidade suficiente de " + nome + " em estoque para retirar.");
                System.out.println("Quantidade de " + produto.getNome() + " disponivel : " + produto.getQuantidade());
                return;
            }
        }
    }


    public void removerProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);

            produtos.remove(i);
            System.out.println("Produto " + nome + " removido com sucesso");
            return;
        }
    }
}
