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


    public void atualizarProduto(String nome, int quantidade, double preco){
        if (produtos.isEmpty()) {
            throw new Excecoes("Não há produtos cadastrados");
        }

        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);
                System.out.println(nome + "atualizado");
                return;
            }
        }
        throw new Excecoes("Produto '" + nome + "' não encontrado");
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
