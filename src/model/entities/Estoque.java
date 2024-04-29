package model.entities;

import java.util.ArrayList;
import model.exceptions.Excecoes;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque(){
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado com sucesso!");
    }


    public void listarProdutos(){
        if (produtos.isEmpty()){
            System.out.println("Nenhum produto em estoque");
        } else {
            System.out.println("Produtos em estoque: ");
            for (Produto produto : produtos){
                String mensagem = String.format("Item: %s, Quantidade: %d, Preço UN: R$ %.2f, Valor total do estoque: R$ %.2f",
                        produto.getNome(), produto.getQuantidade(), produto.getPreco(),
                        produto.getQuantidade() * produto.getPreco());
                System.out.println(mensagem);
            }
        }
    }

    public boolean verificaNome(String nome){
        for (Produto produto : produtos) {
                if (produto.getNome().equals(nome)) {
                    return true;
                }
            }
        throw new Excecoes("Produto não encontrado no estoque.");
    }



    public void atualizarProduto(String nome, int quantidade, double preco) {
        for (Produto produto : produtos) {
            if(produto.getNome().equals(nome)) {
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);

                if(produto.getQuantidade() <= 0) {
                    System.out.println("Devido o estoque ter sido zerado, item foi removido.");
                    removerProduto((nome));
                    return;
                }
                System.out.println("O produto ->" + produto.getNome() + " foi atualizado com sucesso");
                return;
            }
        }
        System.out.println("Produto informado não existe em estoque");
    }

    public void retirarProduto(String nome, int quantidade){
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                if (produto.getQuantidade() >= quantidade) {
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println(quantidade + " unidades de " + nome + " foram retiradas do estoque.");
                    return;
                } else {
                    System.out.println("Não há quantidade suficiente de " + nome + " em estoque para retirar.");
                    return;
                }
            }
        }
        System.out.println("Produto '" + nome + "' não encontrado no estoque.");
    }


    public void removerProduto(String nome){
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getNome().equals(nome)){
                produtos.remove(i);
                System.out.println("Produto " + nome + " removido com sucesso");
                return;
            }
        }
        System.out.println("Produto informado não está em estoque");
    }
}
