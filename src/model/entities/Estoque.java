package model.entities;

import java.util.ArrayList;

public class Estoque {
    // atributos
    private ArrayList<Produto> produtos;

    // método construtor
    public Estoque(){
        this.produtos = new ArrayList<Produto>();
    }

    // C - Create
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto, adicionado com sucesso!");
    }

    // R - Read

    public void listarProdutos(){
        if (produtos.isEmpty()){
            System.out.println("Nenhum produto em estoque");
        } else {
            System.out.println("Produtos em estoque: ");
            for (Produto produto : produtos){
                System.out.println("Nome: " + produto.getNome() + ", Quantidade: "
                        + produto.getQuantidade() + ", Preço: " + produto.getPreco());

            }
        }
    }

    // U - Update
    public void atualizarProduto(String nome, int quantidade, double preco){
        for (Produto produto : produtos){
            if (produto.getNome().equals(nome)){
                    produto.setQuantidade(quantidade);
                    produto.setPreco(preco);
            }
        }
        System.out.println("Produto informado não existe em estoque");
    }

    // D - Delete

    public void removerProduto(String nome){
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getNome().equals(nome)){
                produtos.remove(i);
                System.out.println("Produto removido com sucesso");
                return;
            }
        }
        System.out.println("Produto informado não existe em estoque");
    }
}
