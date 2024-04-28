package diegomoura;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> listaProdutos;

    //region ...Constructor
    public Estoque() {
        this.listaProdutos = new ArrayList<>();
    }
    //endregion

    //region ...CRUD

    //Create
    public void adicionarProdutos(Produto produto) {
        System.out.printf("Produto adicionado com sucesso: ID: %d, Nome: %s, Preço: R$%.2f, Qtda: %d\n",
                produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
        listaProdutos.add(produto);
    }

    //Read
    public void buscarProdutos(int id) {
        boolean produtoEncontrado = false;

        for (Produto listaProduto : listaProdutos) {
            if (listaProduto.getId() == id) {
                produtoEncontrado = true;

                System.out.printf("Produto encontrado: ID: %d, Nome: %s, Preço: R$%.2f, Qtda: %d\n",
                        listaProduto.getId(), listaProduto.getNome(),
                        listaProduto.getPreco(), listaProduto.getQuantidade());
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("\nNão existe produto no estoque com esse ID: " + id);
        }
    }

    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println(" Não existe produtos no estoque :(");
        }
        System.out.println("-------------------------------------------------");
        System.out.println("|          Lita de Produtos no Estoque          |");
        System.out.println("-------------------------------------------------");
        System.out.printf("| %-3s | %-20s | %-8.2s | %-6s|\n" ,
                "ID", "Nome", "$", "Qta");
        System.out.println("-------------------------------------------------");

        for (Produto produto : listaProdutos) {
            System.out.printf("| %3d | %20s | %8.2f | %5d |\n",
                    produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
        }

        System.out.println("-------------------------------------------------");
    }

    // Update
    public void atualizarProduto(Produto produtoAtualizado) {
        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).getId() == produtoAtualizado.getId()) {
                listaProdutos.set(i, produtoAtualizado);
                System.out.println("Produto: " + produtoAtualizado.getNome() + " atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto com ID " + produtoAtualizado.getId() + "não encontrado.");
    }

    //Delete
    public void removeProduto(int id) {
        boolean produtoRemovido = listaProdutos.removeIf(produto -> produto.getId() == id);

        if (produtoRemovido) {
            System.out.println(" Produto com ID " + id + " removido do estoque com sucesso!");
        } else {
            System.out.println(" \n Produto com ID " + id + " não encontrado no estoque!");
        }
    }
    //endregion
}
